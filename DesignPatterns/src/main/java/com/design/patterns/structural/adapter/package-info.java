/**
 * 
 */
/**
 * @author manas.bansal
 *
 */
package com.design.patterns.structural.adapter;

/*
 Step 1 -:
Define the Target interface: This interface should specify the operations that 
the client code expects. So here our client that is you want to charge your phone .

Step 2 -:
Implement the Adaptee class: This class represents the existing component with an incompatible interface. 
So this is the IPhone4s charger that your friend has 
 
Step 3 -:
Create the Adapter class: The Adapter class implements the Target interface and internally 
uses an instance of the Adaptee class. It adapts the Adaptee’s interface to match the 
Target interface by delegating the calls appropriately. So here we will use an IPhone4s 
to IPhone6s adapter so that we can easily charge our IPhone6s . 

Step 4 -:
Connect the client code to the Adapter: Instantiate the Adapter class and use it as a 
bridge between the client code and the Adaptee. So here you will connect your IPhone6s 
to IPhone4s Charger to charge your phone .
 
 */