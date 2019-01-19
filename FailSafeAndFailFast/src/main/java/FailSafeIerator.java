import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class FailSafeIerator {

	public static void main(String[] args) {
		List<String> list	= new LinkedList<String>();

		list.add("Piyush");
		list.add("Manas");
		list.add("Suraj");

		Iterator<String> it	= list.iterator();

		//list.remove("Manas");
		
		/**
		 *  The list-iterator is <i>fail-fast</i>: if the list is structurally
		 * modified at any time after the Iterator is created, in any way except
		 * through the list-iterator's own {@code remove} or {@code add}
		 * methods, the list-iterator will throw a
		 * {@code ConcurrentModificationException}.
		 */


		System.out.println("List is "+list);

		while(it.hasNext()) {
			String item	= it.next();
			
			if(item.equals("Manas")) {
				it.remove();
			}
		}
		
		System.out.println("List is "+list);
	}
}
