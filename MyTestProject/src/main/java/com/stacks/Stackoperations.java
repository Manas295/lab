package com.stacks;


// Java code for stack implementation
 
import java.io.*;
import java.util.*;
 
class Stackoperations
{   
	public static void stack_push(Stack<Integer> stack)
	{
		for(int i=1;i<6;i++)
		{
			stack.push(i);
		}
	}
	public static void stack_pop(Stack<Integer> stack)
	{
		for(int i=1;i<6;i++)
		{
			Integer y = stack.pop();
			System.out.println("Poped element "+y);
		}
	}
     
	public static void stack_peek(Stack<Integer> stack)
	{
		int i = stack.peek();
		System.out.println("Item Peek "+i);
	}
	public static void stack_search(Stack<Integer> stack,int valToSearch)
	{
		int val = stack.search(valToSearch);
		if(val!=-1)
		{
			System.out.println("Value found "+val);
		}
		else
		{
			System.out.println("Value not found ");
		}
	}
    public static void main (String[] args)
    {
        Stack<Integer> stack = new Stack<Integer>();
 
        stack_push(stack);
        stack_pop(stack);
        stack_push(stack);
        stack_peek(stack);
        stack_search(stack, 2);
        stack_search(stack, 6);
    }
}
