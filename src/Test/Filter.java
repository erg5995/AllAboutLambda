package Test;

/**
 * Functional interface = An interface with only one (unimplemented) function.
 * A functional interface is the type that you will pass to the function that
 * is receiving the lambda as an argument.
 */
public interface Filter {
    /**
     * While the implementation may change depending on the lambda, the
     * arguments for the lambda must still match what is given by the
     * interface.
     * @param arg depends on context.
     * @return depends on implementation.
     */
    boolean filter(int arg);
}
