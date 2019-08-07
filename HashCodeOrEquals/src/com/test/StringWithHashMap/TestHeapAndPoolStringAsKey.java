package com.test.StringWithHashMap;

import java.util.HashMap;

public class TestHeapAndPoolStringAsKey {

    public static void main(String[] args) {
        String a    = new String("Ram");
        String b    = "Ram";
        
        System.out.println("a==b "+(a==b));
        System.out.println("a.equals(b) "+a.equals(b));
        System.out.println("a.hashCode()==b.hashCode() "+(a.hashCode()==b.hashCode()));
        HashMap<String, String> hm  = new HashMap<String,String>();
        
        hm.put(a,"value1");
        hm.put(b,"value2");
        
        System.out.println(hm.size());
    }
}