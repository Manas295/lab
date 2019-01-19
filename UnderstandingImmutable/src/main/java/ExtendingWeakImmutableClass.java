
/*
 * This may not be an immutable class
 */

public class ExtendingWeakImmutableClass extends WeakImmutableClass {

	public ExtendingWeakImmutableClass(String name, int age, NonImmutableClassSubject subject) {
		super(name, age, subject);
	}
}
