/**
 * 
 */
/**
 * @author piyush.nautiyal
 *
 */
package com.design.patterns.behavioral.ObserverPattern;

/*
 * Define a one-to-many dependency between objects so that when one object changes state, 
 * all its dependents are notified and updated automatically.
 * Encapsulate the core (or common or engine) components in a Subject abstraction, 
 * and the variable (or optional or user interface) components in an Observer hierarchy.
 * The "View" part of Model-View-Controller.
 * 
 * 
 * To understand observer pattern, first you need to understand the subject and observer objects.
 * The relation between subject and observer can easily be understood as an analogy to magazine subscription.
 * 
 * - A magazine publisher(subject) is in the business and publishes magazines (data).
 * 
 * - If you(user of data/observer) are interested in the magazine you subscribe(register), and 
 *   if a new edition is published it gets delivered to you.
 *   
 * - If you unsubscribe(unregister) you stop getting new editions.
 * 
 * - Publisher doesn’t know who you are and how you use the magazine, it just delivers it to you because you are a 
 *   subscriber(loose coupling).  
 */