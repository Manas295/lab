/**
 * 
 */
/**
 * @author manas.bansal
 *
 */
package com.design.patterns.behavioral.ChainofResponsibility;

/*Chain of responsibility pattern is used to achieve loose coupling 
 * in software design where a request from the client is passed to a 
 * chain of objects to process them. Later, the object in the chain will 
 * decide themselves who will be processing the request and whether the 
 * request is required to be sent to the next object in the chain or not.
 * 
 * 
 * Where and When Chain of Responsibility pattern is applicable :
 * - When you want to decouple a request’s sender and receiver
 * - Multiple objects, determined at runtime, are candidates to handle a request
 * - When you don’t want to specify handlers explicitly in your code
 * - When you want to issue a request to one of several objects without specifying the receiver explicitly.
 * 
 * Handler : This can be an interface which will primarily recieve the request and dispatches the request to chain of handlers. 
 * It has reference of only first handler in the chain and does not know anything about rest of the handlers.
 * 
 * Concrete handlers : These are actual handlers of the request chained in some sequential order.
 * 
 * Client : Originator of request and this will access the handler to handle it.
 *
 */

