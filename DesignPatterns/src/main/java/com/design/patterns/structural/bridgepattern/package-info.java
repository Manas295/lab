/**
 * 
 */
/**
 * @author manas.bansal
 *
 */
package com.design.patterns.structural.bridgepattern;

/*Sec Security System is a security and electronic company which produces and assembles products for cars. It delivers any car
  electronic or security system you want, from air bags to GPS tracking system, reverse parking system etc. Big car companies
  use its products in their cars. The company uses a well defined object oriented approach to keep track of their products using
  software which is developed and maintained by them only. They get the car, produce the system for it and assemble it into the
  car.
  Recently, they got new orders from BigWheel (a car company) to produce central locking and gear lock system for their new xz
  model. To maintain this, they are creating a new software system. They started by creating a new abstract class CarProductSecurity,
  in which they kept some car specific methods and some of the features which they thought are common to all security
  products. Then they extended the class and created two different sub classes named them BigWheelXZCentralLocking, and
  BigWheelXZGearLocking.
 * 
 * 
 * After a while, another car company Motoren asked them to produce a new system of central locking and gear lock for their lm
   model. Since, the same security system cannot be used in both models of different cars, the Sec Security System has produced
   the new system for them, and also has created to new classes MotorenLMCentralLocking, and MotorenLMGearLocking which
   also extend the CarProductSecurity class
   ---------------------------------------------------------------------------------------------------------------------------------
   The Bridge Pattern’s intent is to decouple an abstraction from its implementation so that the two can vary independently. 
   It puts the abstraction and implementation into two different class hierarchies so that both can be extend independently.



-------------------------------------------EXPLANATION FROM geeksforgeeks----------------------------------------------
There are 2 parts in Bridge design pattern :

- Abstraction
- Implementation

 This is a design mechanism that encapsulates an implementation class inside of an interface class.
 
- The bridge pattern allows the Abstraction and the Implementation to be developed independently 
  and the client code can access only the Abstraction part without being concerned about the Implementation part.
  
- The abstraction is an interface or abstract class and the implementor is also an interface or abstract class.

- The abstraction contains a reference to the implementor. Children of the abstraction are referred to as refined 
  abstractions, and children of the implementor are concrete implementors. Since we can change the reference to the 
  implementor in the abstraction, we are able to change the abstraction’s implementor at run-time. Changes to the 
  implementor do not affect client code.

- It increases the loose coupling between class abstraction and it’s implementation.


Abstraction – core of the bridge design pattern and defines the crux. Contains a reference to the implementer.

Refined Abstraction – Extends the abstraction takes the finer detail one level below. Hides the finer elements from implemetors.

Implementer – It defines the interface for implementation classes. This interface does not need to correspond directly 
to the abstraction interface and can be very different. Abstraction imp provides an implementation in terms of operations 
provided by Implementer interface

Concrete Implementation – Implements the above implementer by providing concrete implementation.
 */