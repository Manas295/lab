package consumer;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.DoubleConsumer;
public class BiConsumerDemo {

	public static void main(String[] args) {

		Map<Integer,String> map = new HashMap<>();
	       map.put(1, "A");
	       map.put(2, "B");
	       map.put(3, "C");
	       
	       BiConsumer<Integer,String> biConsumer = (key,value) ->System.out.println("Key:"+ key+" Value:"+ value);
	       map.forEach(biConsumer);
	       
	       
	       
	       map.forEach((key,value) ->System.out.println("KEY:"+ key+" VALUE:"+ value));
	       
	       map.forEach(  (key,value) ->
	                      {
	                    	   if(key>2)
	                    		   System.out.println("KEY:"+ key+" VALUE:"+ value);
	                      }
	                   );
	       
	    
	       
	       
	       BiConsumer<Integer,String> biConsumer2 = (key,value) ->{
	    	                                                       if(key<3)System.out.println("Key:"+ key+" Value:"+ value);
	    	                                                       };
	       map.forEach(biConsumer2);
	       
	       
	       
	}
	       
	       
	}

