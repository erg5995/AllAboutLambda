package Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class Test {

    /** State for this example: a list of integers and random number generator. */
    protected static Random random = new Random();
    protected static List<Integer> list = new ArrayList<>();

    /** The function which will be receiving our lambda functions. */
    protected abstract List<Integer> test(Filter filter);
    /** Where the test will actually be run */
    protected abstract void run();

    /**
     * Initializes the integer array with random integers 0-9.
     * @param size The number of random integers to generate.
     */
    protected void refreshIntegers(int size){
        list = new ArrayList<>();
        for(int i = 0; i < size; i++){
            list.add(random.nextInt(10));
        }
    }

}
