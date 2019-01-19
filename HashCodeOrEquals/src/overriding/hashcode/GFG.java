package overriding.hashcode;
/*
 * REFERENCE LINK :- https://www.geeksforgeeks.org/override-equalsobject-hashcode-method/
 *In this when we call map.put(“xyz”, “IT”); 
 *then it tried to replace first value (CSE) by second value(IT) but it was not possible so it insert second pair (key, value) 
 *into a new LinkedList node that hashmap internally use. 
 *It it total violation of rule as key are unique in map.*/

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