 /**
 * 
 */
/**
 * @author piyush.nautiyal
 *
 */


package com.design.patterns.behavioral;

/*
In these design patterns,the interaction between the objects should be in such a way 
that they can easily talk to each other and still should be loosely coupled.

Eleven well-known design patterns that are parts of structural patterns are the

1 Template Method Pattern : it’s used to create a method stub and deferring some of the steps of implementation to the subclasses. 
Template method defines the steps to execute an algorithm and it can provide default implementation that might be common for all 
or some of the subclasses.

2 Mediator Pattern : Mediator design pattern is used to provide a centralized communication medium between different objects in a 
system. Mediator design pattern is very helpful in an enterprise application where multiple objects are interacting with each other.
If the objects interact with each other directly, the system components are tightly-coupled with each other that makes 
maintainability cost higher and not flexible to extend easily. 
Mediator pattern focuses on provide a mediator between objects for communication and help in implementing lose-coupling 
between objects.

3 Chain of Responsibility Pattern: Chain of responsibility pattern is used to achieve lose coupling in software design where a 
request from client is passed to a chain of objects to process them. Then the object in the chain will decide themselves who 
will be processing the request and whether the request is required to be sent to the next object in the chain or not.

4 Observer Pattern: Observer design pattern is useful when you are interested in the state of an object and want to get notified 
whenever there is any change. In observer pattern, the object that watch on the state of another object are called Observer and 
the object that is being watched is called Subject.

5 Strategy Pattern : Strategy pattern is used when we have multiple algorithm for a specific task and client decides the actual 
implementation to be used at runtime.Strategy pattern is also known as Policy Pattern. We defines multiple algorithms and 
let client application pass the algorithm to be used as a parameter. One of the best example of this pattern is Collections.sort() 
method that takes Comparator parameter.Based on the different implementations of Comparator interfaces, 
the Objects are getting sorted in different ways.

6 Command Pattern: Command Pattern is used to implement lose coupling in a request-response model. 
In command pattern, the request is send to the invoker and invoker pass it to the encapsulated command object. 
Command object passes the request to the appropriate method of Receiver to perform the specific action.

7 State Pattern: State design pattern is used when an Object change it’s behavior based on it’s internal state.

8 Visitor Pattern: Visitor pattern is used when we have to perform an operation on a group of similar kind of Objects. 
With the help of visitor pattern, we can move the operational logic from the objects to another class.

9 Interpreter Pattern:is used to defines a grammatical representation for a language and provides an interpreter to deal with this 
grammar.

10 Iterator Pattern: Iterator pattern in one of the behavioral pattern and it’s used to provide a standard way to 
traverse through a group of Objects. Iterator pattern is widely used in Java Collection Framework where Iterator interface 
provides methods for traversing through a collection.

11 Memento Pattern: Memento design pattern is used when we want to save the state of an object so that we can restore later on. 
Memento pattern is used to implement this in such a way that the saved state data of the object is not accessible outside of the 
object, this protects the integrity of saved state data.

 */
