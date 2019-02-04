package lamdaExpressionBasics;

public class LamdaExpressionDemo {
    
    public static void main(String[] args) {
        
        /**
         * BEFORE JAVA 8
         * 
         * We uses anonymous classes
         */
        
        new Thread(new Runnable() 
        { 
            @Override
            public void run() 
            { 
                System.out.println("New thread created"); 
            } 
        }).start();
        
        
        
        /**
         * AFTER JAVA 8
         * 
         * We can use lamda expression
         */
        
        Runnable runnable   = ()->{System.out.println("New thread created with lamda expression");};
        
        new Thread(runnable).start();
        
    }
}
