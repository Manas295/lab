
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamZero {

	public static void main(String[] args) {
		
		
	
		
		List<String> al = new ArrayList<>();
		al.add("ABC");
		al.add("PQR");
		al.add("XYZ");
		al.add("MNO");
		al.add("IUF");
		
		/*al.stream().sorted().forEach(System.out::println);
		Iterator<String> r=al.stream().iterator();
		while(r.hasNext())
		{
			System.out.println(r.next());
		}*/
		//al.stream().sorted().filter((s)->s.startsWith("A")).forEach(System.out::println);
		
		
		List<Product> productList = Arrays.asList(new Product(23, "potatoes"),
				  new Product(14, "orange"),new Product(94, "orange"), new Product(13, "lemon"),
				  new Product(23, "bread"), new Product(13, "sugar"));
		//System.out.println(productList);
		String listToString = productList.stream().map(Product::getName)
				  .collect(Collectors.joining(", ", "[", "]"));
		//System.out.println(listToString);
		
		
		Map<String, List<Product>> collectorMapOfLists = productList.stream()
				  .collect(Collectors.groupingBy(Product::getName));
		System.out.println(collectorMapOfLists);
		
		
/*		Stream<String> streamGenerated =
				  Stream.generate(() -> "element").limit(10);
		Stream.generate(() -> "element").limit(10).forEach(System.out::println);
*/		
		int reducedParams = Stream.of(1, 2, 3).parallel()
				  .reduce(10, (a, b) -> a + b, (a, b) -> {
				   System.out.println("combiner was called");
				     return a + b;
				  });
		System.out.println(reducedParams);
		
		int reduceSum = Stream.of(1,2,3,4)
				.reduce(10,(a,b)->a+b);
		System.out.println("------"+reduceSum);
	}
}


class Product
{
	int id;
	String vegname;
	public Product(int id, String vegname) {
		super();
		this.id = id;
		this.vegname = vegname;
	}
	public static String getName(Product p)
	{
		return p.vegname;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", vegname=" + vegname + "]";
	}
	
	
	
}

abstract class de
{
	public void demo()
	{
		System.out.println("D");
	}
}

