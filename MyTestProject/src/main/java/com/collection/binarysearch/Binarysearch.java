package com.collection.binarysearch;
import java.util.*;
 
class Binarysearch
{
    public static void main(String[] args)
    {
        // Create a list
        List<Domain> l = new ArrayList<Domain>();
        l.add(new Domain(10, "quiz.geeksforgeeks.org"));
        l.add(new Domain(20, "practice.geeksforgeeks.org"));
        l.add(new Domain(30, "code.geeksforgeeks.org"));
        l.add(new Domain(40, "www.geeksforgeeks.org"));
 
        Comparator<Domain> c = new Comparator<Domain>()
        {
            public int compare(Domain u1, Domain u2)
            {
                return u1.getId().compareTo(u2.getId());
            }
        };
 
        // Searching a domain with key value 10. To search
        // we create an object of domain with key 10.
        int index = Collections.binarySearch(l,
                                 new Domain(10, null), c);
        System.out.println("Found at index  " + index);
 
        // Searching an item with key 5
        index = Collections.binarySearch(l,
                                 new Domain(5, null), c);
        System.out.println(index);
        
        
        List<String> l1 = new ArrayList<String>();
        l1.add("Manas");
        l1.add("piyush"); 
        l1.add("ankit");
        l1.add("Jasmeet");
        l1.add("rekha");
        l1.add("Nipun");
        l1.add("Kristy");
        Collections.sort(l1);
        index = Collections.binarySearch(l1,"Manas");
        System.out.println(index);
        
        List al = new ArrayList();
        al.add(10);
        al.add(2);
        al.add(3);
        al.add(1);
        al.add(20);
        Collections.sort(al);

        index = Collections.binarySearch(al,10);
        System.out.println(index);
    }
}