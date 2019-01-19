package com.journaldev.strings;
/**
 * 
 *It's a simple yet tricky program, it will print "PANKAJ" because we are 
 *assigning s2 String to s1. Don't get confused with == comparison operator.
 */
public class StringTest {

	public static void main(String[] args) {
		String s1 = new String("pankaj");
		String s2 = new String("PANKAJ");
		System.out.println(s1 = s2);
	}

}