package com.forkjoinframework;

import java.util.List;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

/**
 * Class that sums the elements of sublists using the fork/join framework
 */
public class SumAction extends RecursiveAction {
	// A thread can easily handle, let's say, five elements
	private static final int SEQUENTIAL_THRESHOLD = 5;

	// The list with the numbers
	private List<Long> data;

	// Since compute() doesn't take parameters, you have to
	// pass in the task's constructor the data to work
	public SumAction(List<Long> data) {
		this.data = data;
	}

	@Override
	protected void compute() {
		System.out.println("Inside Compute");
		data.stream().forEach(System.out::println);
		if (data.size() <= SEQUENTIAL_THRESHOLD) { // base case
			long sum = computeSumDirectly();
			System.out.format("Sum of %s: %d\n", data.toString(), sum);
		} else { // recursive case
			// Calculate new range
			int mid = data.size() / 2;
			System.out.println("Mid "+mid+" data size "+data.size());
			SumAction firstSubtask =
					new SumAction(data.subList(0, mid));
			SumAction secondSubtask =
					new SumAction(data.subList(mid, data.size()));

//			firstSubtask.fork(); // queue the first task
//			secondSubtask.compute(); // compute the second task
//			firstSubtask.join(); // wait for the first task result

			// Or simply call
			invokeAll(firstSubtask, secondSubtask);
		}
	}

	/** Method that calculates the sum */
	private long computeSumDirectly() {
		long sum = 0;
		for (Long l: data) {
			sum += l;
		}
		return sum;
	}

	public static void main(String[] args) {

//		List<Long> data = random
//				.longs(11, 1, 5)
//				.boxed()
//				.collect(toList());
//	
		List<Long> data = LongStream.of(3,4,5,6,7,8,9,11,22,33,66).boxed().collect(Collectors.toList());

		ForkJoinPool pool = new ForkJoinPool();
		System.out.println("Pool parallelism: " + pool.getParallelism());
		SumAction task = new SumAction(data);
		pool.invoke(task);
		
//		data.stream().forEach(System.out::println);
	}
}