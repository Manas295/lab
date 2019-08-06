package a_static_ref;
import java.util.Arrays;

//Method References to static methods


/*
 * In the code in this line SortClass::sortName; existing method sortName() is referred using method reference. 
 * This works because sortName is compatible with the IMyStringFunc functional interface. 
 * Thus, the expression SortClass::sortName evaluates to a reference to an object in 
 * which method sortName provides the implementation of abstract method stringFunc in
 * functional interface IMyStringFunc.
 */
@FunctionalInterface
interface IMyStringFunc<T, R>{
    R stringFunc(T t);
}
public class MethodRefDemo {
    public static void main(String[] args) {
        //String array of names
       String[] strNames = new String[]{"Ram", "shyam", "Ramesh", "John", "brad", 
               "Suresh"};
       // method reference to the static method sortName
    
       IMyStringFunc<String[],String[]> stringFunc = SortClass::sortName;
       IMyStringFunc<String[],String[]> stringFunc1 = (names) -> {
    	   Arrays.sort(names);
    	   return names;
       };
       
       // Here calling strngFunc will refer to the implementing method
       // sortName()
       String[] sortedNames = stringFunc1.stringFunc(strNames);
       for(String name : sortedNames){
           System.out.println(name);
       }
   }
}

class SortClass{
    // A static method that sorts an array
    static String[] sortName(String[] names) {
        //Sorting array using sort method (case sensitive)
        Arrays.sort(names);
        return names;
    }
    static String[] sortName1(String[] names) {
        //Sorting array using sort method (case sensitive)
        Arrays.sort(names);
        return names;
    }
}