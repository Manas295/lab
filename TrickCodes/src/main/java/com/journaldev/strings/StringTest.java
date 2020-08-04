package com.journaldev.strings;
/**
 * 
 *It's a simple yet tricky program, it will print "PANKAJ" because we are 
 *assigning s2 String to s1. Don't get confused with == comparison operator.
 */
public class StringTest {

	public static void main(String[] args) {
		String s2 = new String("Baeldung");
		String s3 = "Baeldung";
		System.out.println(s3 == s2);
		
		
		String s4 = s2;
		System.out.println(s4 == s2);
		
		String st1 = "Rahul";
        String st2 = "Rahul";
        String st3 = new String("Rahul").intern();
        if(st1.equals(st3)){//st1 == st3
            System.out.println("rk if");
        }
        if(st1 == st3){
            System.out.println("rk else");
        }

	}

}