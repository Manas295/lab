package com.phaser.example;

public class Packageinfo {

	//Methods in Java Phaser class
/*
 * register()- Adds a new unarrived party to this phaser. It returns the arrival phase number to which this registration applied.
 * 
 * arrive()- Arrives at this phaser, without waiting for others to arrive. Note that arrive() 
 * method does not suspend execution of the calling thread. Returns the arrival phase number, 
 * or a negative value if terminated. Note that this method should not be called by an unregistered party.
 * 
 * arriveAndDeregister()- Arrives at this phaser and deregisters from it without waiting for others to arrive. 
 * Returns the arrival phase number, or a negative value if terminated.
 * 
 * arriveAndAwaitAdvance()- This method awaits other threads to arrives at this phaser. 
 * Returns the arrival phase number, or the (negative) current phase if terminated. 
 * If you want to wait for all the other registered parties to complete a given phase then use this method.
 * 
 * bulkRegister(int parties)– Used to register perties in bulk. Given number of new unarrived parties 
 * will be registered to this phaser.
 * 
 * onAdvance(int phase, int registeredParties)– If you want to perform some action before the phase 
 * is advanced you can override this method. Also used to control termination.
 */
	
}
