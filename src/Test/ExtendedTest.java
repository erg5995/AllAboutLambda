package Test;

import java.util.ArrayList;
import java.util.List;

public class ExtendedTest extends Test {

    /** Constants which define the range for one of our lambda functions */
    private final int LOWER_BOUND = 3;
    private final int UPPER_BOUND = 8;

    /**
     * Method which receives a lambda function. Uses the function as a rule
     * to filter through a list and return the filtered list. This time,
     * the original list is preserved.
     * @param filter the rule by which to filter from the list.
     * @return the filtered list.
     */
    @Override
    protected List<Integer> test(Filter filter) {
        List<Integer> filteredList = new ArrayList<>();
        for(int i = 0; i < list.size(); i++){
            if(filter.filter(list.get(i))){
                filteredList.add(list.get(i));
            }
        }
        return filteredList;
    }

    @Override
    protected void run() {

        refreshIntegers(25);

        System.out.println("list: " + list.toString());

        List<Integer> range = (test(arg -> arg >= LOWER_BOUND && arg < UPPER_BOUND));
        List<Integer> primes = (test(arg -> {
            if(arg > 0 && arg <= 3){
                return true;
            }else if(arg == 0){
                return false;
            }
            for(int i = 2; i < arg; i++){
                if(arg % i == 0){
                    return false;
                }
            }
            return true;
        }));

        System.out.println("range: " + range.toString());
        System.out.println("primes: " + primes.toString());

    }
}
