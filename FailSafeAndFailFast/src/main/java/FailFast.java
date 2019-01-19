import java.util.ArrayList;
import java.util.Iterator;

public class FailFast {
	public static void main(String[] args) {
		ArrayList<String> list	= new ArrayList<>();
		
		list.add("Manas");
		list.add("Sumit");
		list.add("Tarun");
		list.add("Suraj");
		
		
		Iterator<String> listIterator	= list.iterator();
		
		while(listIterator.hasNext()) {
			System.out.println("We get value ["+listIterator.next()+"]");
			list.add("Piyush"); // It will throw concurrent modification Exception
		}
	}
}
