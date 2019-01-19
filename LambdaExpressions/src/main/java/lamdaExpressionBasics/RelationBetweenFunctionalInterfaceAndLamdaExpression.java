package lamdaExpressionBasics;

public class RelationBetweenFunctionalInterfaceAndLamdaExpression {
    /**
     * 
     * 1. Lambda expressions basically express instances of functional interfaces
     * 2. lambda expressions implement the only abstract function 
     *    and therefore implement functional interfaces
     * 
     */

    public static void main(String[] args) {

        FunctionalInterfaceDemo functionalInterfaceDemo = (/*As there is no parameter in doSomething method so it will be bank*/)->{
            /**
             * This will be the implementation of the method doSomething() in FunctionalInterfaceDemo
             */
            System.out.println("Do something method is called");
        };
        
        functionalInterfaceDemo.doSomething();
    }
}
