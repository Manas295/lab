package LambdaForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpressionExample4{  
    public static void main(String[] args) {  
          
        List<String> list=new ArrayList<String>();  
        list.add("Manas");  
        list.add("Mitesh");  
        list.add("Piyush");  
        list.add("Arun");  
          
        list.forEach(  
            (n)->System.out.println(n)  
        );  
    }  
}  