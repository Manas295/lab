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

 */