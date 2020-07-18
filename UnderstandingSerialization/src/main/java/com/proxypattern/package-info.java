package com.proxypattern;

/*
writeReplace() method in Java

Serializable classes that use an alternative object (proxy object) when writing an object to the 
stream should implement writeReplace() method with the exact signature:

ANY-ACCESS-MODIFIER Object writeReplace() throws ObjectStreamException;
This writeReplace() method is invoked by serialization if the method exists and this method is defined within the 
original class whose object is serialized. Thus, the method can have private, protected and package-private access modifier.

readResolve() method in Java

Classes that need to provide a replacement object when the serialized object is read from the stream should implement 
readResolve() method with the exact signature.

ANY-ACCESS-MODIFIER Object readResolve() throws ObjectStreamException;
This readResolve() method follows the same invocation rules and accessibility rules as writeReplace. */

/*
How Serialization Proxy pattern works in Java
Rather than serializing the original class you provide functionality using the writeReplace() method to 
serialize the proxy class instead. Here note that writeReplace() method is implemented in the original class.

At the time of deserialization proxy object is deserialized and then the readResolve() method is called. 
That’s where you will have to provide the functionality to create the original class object regular way. 
Here note that readResolve() method is implemented in the proxy class.

Proxy class
Generally serialization proxy pattern is implemented by creating a proxy class as a nested static class 
with in the original class. Since it needs access to the fields of the outer class so that it is better to 
create proxy class as a nested class.

*/