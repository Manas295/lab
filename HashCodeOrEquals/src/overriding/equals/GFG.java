package overriding.equals;
/*
 * REFERENCE LINK :- https://www.geeksforgeeks.org/override-equalsobject-hashcode-method/
 * As you can see clearly, both values are getting stored into different bucket locations. 
 * Like that every insert into map will get different bucket location whether we are using same key objects or different 
 * i.e. state of key objects is same or different.
 */
import java.util.HashMap;
import java.util.Map;

class GFG 
{
    public static void main (String[] args) 
    {
         
        // creating two Objects with 
        // same state
        Geek g1 = new Geek("aditya", 1);
        Geek g2 = new Geek("aditya", 1);
         
        Map<Geek, String> map = new HashMap<Geek, String>();
        map.put(g1, "CSE");
        map.put(g2, "IT");
         
        for(Geek geek : map.keySet())
        {
            System.out.println(map.get(geek).toString());
        }
 
    }
}