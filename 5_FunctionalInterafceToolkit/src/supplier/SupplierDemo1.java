package supplier;

import java.util.function.Supplier;
/*
	@FunctionalInterface
	public interface Supplier {
	  T get();
	}
	The supplier does the opposite of the consumer, 
	so it takes no arguments but it returns some value by calling its get() method.
*/


public class SupplierDemo1 {
	public static void main(String[] args) {
		
		Supplier<Item> supplier1=()-> new Item();		
		Supplier<Item> supplier = Item::new;
		Item item = supplier1.get();
		System.out.println(item.getMsg());	 
	}
}


class Item {
	private String name;

	public Item(){     
    }

	public Item(String name){     
        this.name=name;
    }

	public static String getStaticVal() {
		return "Static Val";
	}

	public String getMsg(){
        return "Hello World!";
    }

	public String getName() {
        return name;
    }

	public void setName(String name) {
        this.name = name;
    }
}
