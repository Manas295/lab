import java.io.Serializable;

public class ClassToSerialize extends SomeAbstractClass implements Serializable{
	int a	= 20;
	int b	= 30;
	transient int c	= 40;
}