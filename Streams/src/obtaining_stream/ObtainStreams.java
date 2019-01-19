package obtaining_stream;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class ObtainStreams {

	static List<String> list = populateList();
	static Map<String , String > map = populateMap(); 
	
	public static void main(String[] args) throws Exception{  
	    
     
	
       System.out.println("**********Obtain Stream from list**************");
       Stream<String>   str =  list.stream();
       str.forEach(x -> System.out.println(x));
		
       System.out.println("**********Obtain Stream from map using entrySet()**************");
       map.entrySet().stream().forEach(x -> System.out.println(x));
       
       System.out.println("**********Obtain Stream from map using keySet()**************");
       map.keySet().stream().forEach(x -> System.out.println(x));
       
       System.out.println("**********Obtain Stream from map using values()**************");
       map.values().stream().forEach(x -> System.out.println(x));
       
       System.out.println("**********Obtain Stream from String using chars*************");
	   "Hello Citiustech".chars().forEach(x -> System.out.println(Character.toChars(x)));
	   
	   System.out.println("**********Obtain Stream from String using split*************");
	   Stream.of("A,B,C,D".split(",")).forEach(x -> System.out.println(x));
	   
	   
	   System.out.println("**********Obtain Stream from Array*************");
	   Integer[] array ={0,1,2,4,5,6,7,8,9,10};
	   Stream.of(array).forEach(x -> System.out.println(x));
	   
	   
	   System.out.println("**********Obtain Stream of values*************");
	   Stream.of("one","two","three").forEach(x -> System.out.println(x));
	   
	   
	   System.out.println("**********Obtain Stream from function generate*************");
	   Stream<Double> st1 = Stream.generate(()->{return Math.random();}).limit(20);
	   st1.forEach(x -> System.out.println(x));
	   
	   
	   System.out.println("************** Obtain Stream from function iterate **********");
	   Stream.iterate(5, i->i+2).limit(10).forEach(x -> System.out.println(x));
	   
	   System.out.println("************** Obtain Stream from builder *************");
	   Stream.builder().add("One").add("Two").add("Three").build().forEach(x -> System.out.println(x));
	   
	   
	   System.out.println("************** Obtain Stream from another strams ***************");
	   populateList().stream().distinct().limit(2).sorted().forEach(x -> System.out.println(x));
	   
	   

       long uniqueWords = Files.lines(Paths.get("d:/file/FileFilter1.java"), Charset.defaultCharset())
                               .flatMap(line -> Arrays.stream(line.split(" ")))
                               .distinct()
                               .count();

       System.out.println("There are " + uniqueWords + " unique words in FileFilter1.txt");
       
       
       

	}

	
	public static List<String> populateList(){
		List<String> list = new ArrayList<String>();
		list.add("list value 1");
		list.add("list value 2");
		list.add("list value 3");
		list.add("list value 4");
		list.add("list value 5");		
		return list;
	}
	public static Map<String,String> populateMap(){
		Map<String,String> map = new HashMap<String, String>();
		map.put("map key 1" , "map value 1");
		map.put("map key 2" , "map value 2");
		map.put("map key 3" , "map value 3");
		map.put("map key 4" , "map value 4");
		map.put("map key 5" , "map value 5"); 
		return map;
	}
}
