import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentTest {
public static void main(String[] args) {
	
	ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<String, String>();
	try
	{
		concurrentHashMap.put("1", "Manas");
		concurrentHashMap.put("2", "Piyush");
		concurrentHashMap.put("3", "Sonia");
		concurrentHashMap.put("4", "Suraj");
		
		Set set = concurrentHashMap.keySet();
		
		Iterator<String> itr	= set.iterator();
		
		concurrentHashMap.put(".1", "TP");
		
		System.out.println("Set1 is ["+set+"] size of map "+concurrentHashMap.size());
		
		set.remove("1");
		
		System.out.println("Set1 is ["+set+"] size of map "+concurrentHashMap.size());
		
		concurrentHashMap.put("6", "Rajat");
		concurrentHashMap.put("7", "Rohit");
		concurrentHashMap.put("8", "Naveen");
		concurrentHashMap.put("0", "Sanjeev");
		concurrentHashMap.put("9", "Naveen");

		while(itr.hasNext())
		{
			
			String  key = itr.next();
			concurrentHashMap.put("5","HUM");
			System.out.println("Key "+key+" Value "+concurrentHashMap.get(key)+" Size of map "+concurrentHashMap.size() );
			concurrentHashMap.remove("3");
		}
		
	}
	catch(Exception ee)
	{
		ee.printStackTrace();
	}
	
	
	
}
}
