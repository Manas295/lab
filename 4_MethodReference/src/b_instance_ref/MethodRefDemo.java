package b_instance_ref;

import java.util.Arrays;


//Method References to Instance Methods



@FunctionalInterface
interface IMyStringFunc<T, R>{
    R stringFunc(T t);
}

public class MethodRefDemo {
 
    public static void main(String[] args) {
        // creating an object
        SortClass sc = new SortClass();
         //String array of names
        String[] strNames = new String[]{"Ram", "shyam", "Ramesh", "John", "brad", 
                "Suresh"};
        
        // method reference to the instance method sortName
        IMyStringFunc<String[],String[]> refObj = sc::sortName;
        IMyStringFunc<String[],String[]> refObj1 = (names) -> {
     	   Arrays.sort(names);
     	   return names;
        };
        String[] sortedNames = refObj1.stringFunc(strNames);
        for(String name : sortedNames){
            System.out.println(name);
        }
    }
}

class SortClass{
    // A non-static method that sorts an array
    String[] sortName(String[] names) {
        //Sorting array using sort method (case sensitive)
        Arrays.sort(names);
        return names;
    }
}