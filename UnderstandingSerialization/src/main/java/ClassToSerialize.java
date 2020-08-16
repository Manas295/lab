import java.io.Serializable;

public class ClassToSerialize extends SomeAbstractClass implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int a	= 20;
	int b	= 30;
	transient int c	= 40;
	String name ="Manas ";
}