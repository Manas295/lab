package stream.apis.question;

public class StreamOperationInfo {
	/*
1. Collectors.groupingBy() Method
1.1. Syntax
The groupingBy() method returns a Collector implementing a “GROUP BY” operation 
on Stream elements and returns the result as a Map.

Syntax
groupingBy(classifier)
groupingBy(classifier, collector)
groupingBy(classifier, supplier, collector)

We can pass the following arguments to this method:

classifier: maps input elements to map keys
collector: is the downstream reduction function. By default, Collectors.toList() is used 
which causes the grouped elements into a List.
supplier: provides a new empty Map into which the results will be inserted. 
By default, HashMap::new is used. We can use other maps such as TreeMap, 
LinkedHashMap or ConcurrentMap to insert additional behavior in the grouping process such as sorting.
	 */

}
