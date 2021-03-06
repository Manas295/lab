package com.forkjoinframework;


import java.util.List;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

import static java.util.stream.Collectors.toList;

/**
 * Class that sums the elements of sublists using the fork/join framework
 */
public class SumTask extends RecursiveTask<Long> {
	// A thread can easily handle, let's say for testing, five elements
	//private static final int SEQUENTIAL_THRESHOLD = 5;
	// To compare the performance, I'm testing with 100,000
	private static final int minimumProcessingSize = 4;

	// The list with the numbers
	private List<Long> data;

	// Since compute() doesn't take parameters, you have to
	// pass in the task's constructor the data to work
	public SumTask(List<Long> data) {
		this.data = data;
	}

	//Return type matches the generic
	@Override
	protected Long compute() {
		System.out.println(data.toString());
		if (data.size() <= minimumProcessingSize) { // base case
			System.out.println("Inside If Block");
			long sum = computeSumDirectly();
			System.out.format("Sum of %s: %d\n", data.toString(), sum);
			return sum;
		} else { // recursive case
			// Calculate new range
			int mid = data.size() / 2;
			System.out.println("Mid-> "+mid);
			SumTask firstSubtask =
					new SumTask(data.subList(0, mid));
			SumTask secondSubtask =
					new SumTask(data.subList(mid, data.size()));

			// queue the first task
			//We will submit subTasks by using fork() method,
			//fork() method submits the tasks asynchronously, i.e. it
			//won't wait for tasks to finish.
			firstSubtask.fork();
			secondSubtask.fork();

			// Return the sum of all subtasks
			//join() method waits for subtask to return result.
			//Once task will complete it will return and result will be
			//available. Then we will sum up the result returned by two tasks. 
			return firstSubtask.join() + secondSubtask.join();

		}
	}

	/** Method that calculates the sum */
	private long computeSumDirectly() {
		long sum = 0;
		//		for (Long l: data) {
		//			sum += l;
		//		}
		//		return sum;
		//		
		return data.stream().mapToLong(val->val).sum();

	}

	public static void main(String[] args) {
		List<Long> data = LongStream.of(3,4,5,6,7,8,9,11,22,33,66).boxed().collect(Collectors.toList());


		ForkJoinPool pool = new ForkJoinPool();
		System.out.println("Pool parallelism: " + pool.getParallelism());
		SumTask task = new SumTask(data);
		System.out.println("Sum: " + pool.invoke(task));
	}
}
