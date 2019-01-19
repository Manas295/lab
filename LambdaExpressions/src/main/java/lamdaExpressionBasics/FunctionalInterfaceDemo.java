package lamdaExpressionBasics;

/**
 * Functional Interfaces
    ________________________
    A functional interface is an interface that contains only one abstract method

    A functional interface can have any number of default methods. 
    Runnable, ActionListener, Comparable are some of the examples of functional interfaces.
 */



@FunctionalInterface
/**
 * 
 * @FunctionalInterface annotation is used to 
    ensure that the functional interface can’t have more than one abstract method. 
 *
 */
public interface FunctionalInterfaceDemo {
    public abstract void doSomething();
}