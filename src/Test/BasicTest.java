package Test;

import java.util.ArrayList;
import java.util.List;

public class BasicTest extends Test{

    /**
     * The method which receives a lambda function. In this example, this method
     * will filter numbers out of a list based on the given lambda function, and
     * return the filtered list of integers.
     * @param filter the rule to filter the integer array by.
     * @return the filtered integer array.
     * @Override abstract method.
     */
    @Override
    protected List<Integer> test(Filter filter){
        List<Integer> filteredList = new ArrayList<>();
        for(int i = list.size() - 1; i >= 0; i--) {
            if (filter.filter(list.get(i))){
                filteredList.add(list.remove(i));
            }
        }
        return filteredList;
    }

    /**
     * Initializes the integer array with size 10.
     * Creates three new lists using the test method, providing it with a rule
     * with which to filter each list using anonymously-defined (lambda) functions.
     * Prints the results of this test.
     * @Override abstract method.
     */
    @Override
    public void run() {

        refreshIntegers(10);

        System.out.println("list: " + list.toString());

        List<Integer> greater = test(arg -> arg > 5);
        List<Integer> lesser = test(arg -> arg < 5);
        List<Integer> equal = test(arg -> arg == 5);

        System.out.println("greater: " + greater.toString());
        System.out.println("lesser: " + lesser.toString());
        System.out.println("equal: " + equal.toString());

    }
}
