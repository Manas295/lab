package first;

import java.util.*;
import java.util.stream.*;
 
import static first.Dish.menu;


public class StreamBasic {
    public static void main(String...args){    	
    	
// 		 //Java 7
       getLowCaloricDishesNamesInJava7(Dish.menu).forEach(System.out::println);
    	

//        //Java 8
        getLowCaloricDishesNamesInJava8(Dish.menu).forEach(System.out::println);
    }

    public static List<String> getLowCaloricDishesNamesInJava7(List<Dish> dishes){
       
    	List<Dish> lowCaloricDishes = new ArrayList<>();
    	//filter
        for(Dish d: dishes){
            if(d.getCalories() > 400){
                lowCaloricDishes.add(d);
            }
        }       
        //sorting
        Collections.sort(lowCaloricDishes, new Comparator<Dish>() {
            public int compare(Dish d1, Dish d2){
                return Integer.compare(d1.getCalories(), d2.getCalories());
            }
        });           
        // mapping
        List<String> lowCaloricDishesName = new ArrayList<>();
        for(Dish d: lowCaloricDishes){
            lowCaloricDishesName.add(d.getName());
        }
        return lowCaloricDishesName;
    }
   
    public static List<String> getLowCaloricDishesNamesInJava8(List<Dish> dishes){
        return dishes.stream()
                .filter(d -> d.getCalories() > 400)
                .sorted((d1,d2) ->{
                	return Integer.compare(d1.getCalories(),d2.getCalories());                 	
                })
                .map(d ->{
                	return d.getName();
                })
                .collect(Collectors.toList());
        
    }
    
   /* public static List<String> getLowCaloricDishesNamesInJava8(List<Dish> dishes){
        return dishes.stream()
                .filter(d -> d.getCalories() > 400)
                .sorted(Comparator.comparing(Dish::getCalories))
                .map(Dish::getName)
                .collect(Collectors.toList());
        
    }*/
} // streams can be consumed only once
