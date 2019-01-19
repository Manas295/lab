package overriding.hashcode;
// Java program to illustrate 
// Overriding only hashCode() method
 
import java.io.*;
import java.util.*;
 
class Geek 
{
    String name;
    int id;
      
    Geek(String name, int id)
    {
        this.name = name;
        this.id = id;
     }
     
    @Override
    public int hashCode()
    {
          
        // We are returning the Geek_id 
        // as a hashcode value.
        // we can also return some 
        // other calculated value or may
        // be memory address of the 
        // Object on which it is invoked. 
        // it depends on how you implement 
        // hashCode() method.
        return this.id;
    }
      
}