package overriding.both.hashcode.equals;
/*
 * REFERENCE LINK :- https://www.geeksforgeeks.org/override-equalsobject-hashcode-method/
 * In this case we override both methods properly.
When we call map.put(g1, “CSE”); it will hash to some bucket location and when we call map.put(g2, “IT”);,
it will generates same hashcode value (same as g1) and replace first value by second value because 
while iterating over same bucket it found a k such that k.equals(g2) is true,
means searching key already exist. So, it replaces old value of that key by new value.
 */
import java.util.HashMap;
import java.util.Map;

class GFG 
{
	public static void main (String[] args) 
	{

		// creating two Objects with 
		// same state
		Geek g1 = new Geek("aditya", 1);
		Geek g2 = new Geek("aditya", 1);

		Map<Geek, String> map = new HashMap<Geek, String>();
		map.put(g1, "CSE");
		map.put(g2, "IT");

		for(Geek geek : map.keySet())
		{
			System.out.println(map.get(geek).toString());
		}

	}
}
