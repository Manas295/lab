
public class Package_Info {

/*Externalization serves the purpose of custom Serialization, where we can decide what to store in stream.

* Key differences between Serializable and Externalizable

Implementation : Unlike Serializable interface which will serialize the variables in object with just by implementing interface, 
here we have to explicitly mention what fields or variables you want to serialize.

Methods : Serializable is marker interface without any methods. Externalizable interface contains two methods: writeExternal() 
and readExternal().

Process: Default Serialization process will take place for classes implementing Serializable interface. Programmer defined 
Serialization process for classes implementing Externalizable interface.

Backward Compatibility and Control: If you have to support multiple versions, you can have full control with Externalizable 
interface. You can support different versions of your object. If you implement Externalizable, it’s your responsibility 
to serialize super class.

public No-arg constructor: Serializable uses reflection to construct object and does not require no arg constructor. 
But Externalizable requires public no-arg constructor.
	 * 
	 */

}
