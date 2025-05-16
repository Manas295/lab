package com.design.patterns.structural.Flyweight;
/*
The Flyweight Design Pattern is a structural design pattern that focuses on 
reducing the number of objects that need to be created, minimizing memory usage, 
and increasing performance. This pattern is especially useful when dealing with a 
large number of objects with similar states or configurations.


The key principle behind the Flyweight pattern is to separate the intrinsic state 
from the extrinsic state of an object:

Intrinsic State: This is the shared part of the state that is common across all 
objects and can be centralized. The intrinsic state is stored in the flyweights and is immutable.

Extrinsic State: This state varies between objects and cannot be shared. 
The client code must provide it when it uses the flyweight.

Flyweight objects are typically managed by a factory that ensures proper sharing. 
When a client requests a flyweight, the factory checks if an appropriate flyweight 
already exists and returns it; if not, it creates a new one.


THE SCENARIO :

Assume you are creating a particle system for a video game in which thousands of 
particles are rendered on screen, such as smoke, sparks, or magic effects. 
In addition to shared characteristics like texture, shape, and color, every particle
 possesses unique characteristics like position, velocity, and lifespan.

Flyweight Application:

Instead of storing texture, shape, and color for each particle, 
use the Flyweight Pattern to share these properties across all particles,
significantly reducing the memory footprint.
 
The ParticleType class is a flyweight that contains the shared properties for particles.

createType manages a cache to reuse ParticleType instances with the same properties.

Particle instances have unique properties like position and velocity, but share a common ParticleType.

The ParticleSystem class manages a collection of particles. When a new particle is added, 
it uses the ParticleType.createType to get or create a shared type.

During the game loop, each particle is updated and drawn using both its unique
 properties and shared type properties.
*/