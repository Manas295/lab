import java.io.Serializable;

public class SomeContretClass extends SomeAbstractClass implements Serializable {
	int a = 5;
	int b = 6;
	transient int c = 7;
}
