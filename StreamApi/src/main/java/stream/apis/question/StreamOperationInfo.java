package stream.apis.question;

public class StreamOperationInfo {
	/*
1. Collectors.groupingBy() Method
1.1. Syntax
The groupingBy() method returns a Collector implementing a “GROUP BY” operation 
on Stream elements and returns the result as a Map.

Syntax
groupingBy(classifier)
groupingBy(classifier, collector) //Returns a Collector implementing a cascaded "group by" 
operation on input elements of type T, grouping elements according to a classification function, 
and then performing a reduction operation on the values associated with a given key using the 
specified downstream Collector. 
The classification function maps elements to some key type K.The downstream collector operates on elements of type T andproduces a result of type D. The resulting collector produces a Map<K, D>. 

groupingBy(classifier, supplier, collector)

We can pass the following arguments to this method:

classifier: maps input elements to map keys
collector: is the downstream reduction function. By default, Collectors.toList() is used 
which causes the grouped elements into a List.
supplier: provides a new empty Map into which the results will be inserted. 
By default, HashMap::new is used. We can use other maps such as TreeMap, 
LinkedHashMap or ConcurrentMap to insert additional behavior in the grouping process such as sorting.

-----------------------
Collectors.partitionBy - It is used to partition the elements of a stream into two 
groups based on a given predicate
-----------------------
chars()-use to convert string into  Instream of character
mapToObj -> like maToObj(c->String.valueof((char)c) is used to convert each remaining int character
back to string
mapToObj(c -> (char) c) - used to convert each integer (val of char in integer)back to its 
corresponding character
	 */
	

}
