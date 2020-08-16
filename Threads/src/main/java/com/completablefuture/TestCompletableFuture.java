package com.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestCompletableFuture {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		/*Let’s start with a simple example where a new CompletableFuture is returned that is already completed with 
		 the given value.*/
		String str = "Hello";
		CompletableFuture<String> cf = CompletableFuture.completedFuture(str);
		if(cf.isDone()) {
		    System.out.println("Value- " + cf.get());
		}
		
		/*Running an asynchronous task using runAsync(Runnable runnable) method. This method returns a CompletableFuture<Void>.*/
		CompletableFuture<Void> asyncCf = CompletableFuture.runAsync(()->{
		    System.out.println("Task executing asynchronously");
		});

		System.out.println(" runAsync Value- " + asyncCf.get());
		
		/* runAsync() is fine for running asynchronous computations but it doesn't return value. 
		 * If you want to return a new CompletableFuture with a value then you can use supplyAsync(Supplier<U> supplier) method. 
		 * Here U is the type of value obtained by calling the given Supplier.
		 */
		CompletableFuture supplyAsync = CompletableFuture.supplyAsync(()->{
			 return "Hello";
			});
			System.out.println("supplyAsync Value- " + supplyAsync.get());
			
		/* Let’s add a new stage to create a chain.*/
			/*
			 * Here thenApply(Function<? super T,? extends U> fn) method is used. 
			 * The current stage (thenApply() method) is executed with previous stage's 
			 * result as the argument to the supplied function and it returns a new CompletionStage.
			 */
			CompletableFuture<String> cf1 = CompletableFuture.supplyAsync(()->{
			    return "Hello";
			}).thenApply(value-> value.toUpperCase());

			System.out.println("supplyAsync with thenApply Value- " + cf1.get());
		
		/* Using the Async variant of the method where an Executor is passed. Note that with the Async variant, 
		 * method is asynchronously executed in a separate thread obtained from the Executor or from the ForkJoinPool.commonPool() 
		 * based on the Async variant used.
		 */
			ExecutorService executor = Executors.newFixedThreadPool(2);
			CompletableFuture<String> cf2 = CompletableFuture.supplyAsync(()->{
			    return "Hello";
			}).thenApplyAsync(value-> value.toUpperCase(), executor);

			System.out.println("supplyAsync with thenApplyAsync Value- " + cf2.get());
			executor.shutdown();
			
		/*
		 * Using thenAccept() method if there is no value to return from the stage. 
		 * There is also thenRun() method which doesn’t return value and takes Runnable as argument.
		 */
			CompletableFuture.supplyAsync(()->{
			    return "Hello";
			}).thenAccept(value-> {
			    System.out.println("supplyAsync with thenAccept Value- " + value);
			});
			
			/*thenApply()- Returns a new CompletionStage where the type of the result is based on the 
			  argument to the supplied function of thenApply() method.
			*/
			
			CompletableFuture<CompletableFuture<String>> cf3 = CompletableFuture.supplyAsync(()->{
			    return "Hello";
			}).thenApply(value-> {
			    String str1 = value.toUpperCase();
			    return CompletableFuture.completedFuture(str1);
			});
			System.out.println("supplyAsync with thenApply Value- " + cf3.get().get());
			//CompletableFuture<CompletableFuture<String>> so using get().get() will give 
			//exact result
			
			/*thenCompose()- Returns a new CompletionStage where the type of the result is same as the type of 
			  the previous stage.
			*/
			CompletableFuture<String> cf4 = CompletableFuture.supplyAsync(()->{
			    return "Hello";
			}).thenCompose(value-> {
			    String str4 = value.toUpperCase();
			    return CompletableFuture.completedFuture(str4);
			});
			System.out.println("supplyAsync with thenCompose Value- " + cf4.get());	
			
			//Combining two independent CompletableFutures
			/*There is a thenCombine() method that can be used if you want to combine 
			 * two independent CompletableFutures in a way that when both of the CompletableFutures finish, 
			 * you want to execute some logic with the results of both.

			thenCombine(CompletionStage<? extends U> other, BiFunction<? super T,? super U,? extends V> fn)- Returns a new 
			CompletionStage that, when this and the other given stage both complete normally, is executed with the two results 
			as arguments to the supplied function.*/
			CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> {
			    return "Combining two CompletableFutures";
			});

			CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> {
			    return "and getting a new CompletableFuture";
			});

			CompletableFuture<String> result = future1.thenCombine(future2, (str1, str2) -> str1 + " " + str2);
			System.out.println( "thenCombine Value- " + result.get());
				
			//Excepion Handling Esample
			String str3 = null; //"Hello"
			CompletableFuture<String> value = CompletableFuture.supplyAsync(() -> {
			  if (str3 == null)
			    throw new IllegalArgumentException("Invalid String value passed " + str3);
			  System.out.println("String is "+str3);
			  return str3;
			}).exceptionally(exp -> {
			  System.out.println("Exception thrown with message - " + exp.getMessage());
			  return "";
			});
			
			//CompletableFuture exception handling with handle example

			String str5 = null;
			CompletableFuture<String> value1 = CompletableFuture.supplyAsync(() -> {
			  if (str5 == null)
			    throw new IllegalArgumentException("Invalid String value passed " + str5);
			  return str5;
			}).handle((s, exp) -> {
			  if(exp != null) {
			    System.out.println("Exception thrown with message - " + exp.getMessage());
			    s = "";
			  }
			  return s;
			});
			System.out.println(" exception with handle Value - "+value1.get());
			
			//CompletableFuture exception handling with whenComplete example

			String str6 = null;
			CompletableFuture<String> val = CompletableFuture.supplyAsync(() -> {
			  if (str6 == null)
			    throw new IllegalArgumentException("Invalid String value passed " + str6);
			  return str6;
			}).whenComplete((s, exp) -> {
			  System.out.println("in whenComplete method");
			  if(exp != null) {
			    System.out.println("Exception thrown with message - " + exp.getMessage());
			    //s = "";
			  }
			});
			System.out.println(" exception with whenComplete Value - "+val.get());

	}
		
}
