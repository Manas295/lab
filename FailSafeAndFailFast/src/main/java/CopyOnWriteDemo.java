import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteDemo {

	public static void main(String[] args) {

		CopyOnWriteArrayList<String> list	= new CopyOnWriteArrayList<String>();

		list.add("Element2");
		list.add("Element3");
		list.add("Element4");

		/*
		 * when we create an iterator for the CopyOnWriteArrayList, 
		 * we get an immutable snapshot of the data in the list at the time iterator() was called.
		 */
		Iterator<String> listIterator	= list.iterator();
		
		list.add("Element1");
		
		while(listIterator.hasNext()) {
			System.out.println("Value from list is ["+listIterator.next()+"]");
			System.out.println("list is "+list);
			list.add("Element5");
			list.remove("Element3");
		}

	}

}
