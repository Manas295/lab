package com.completablefuture;
/*
CompletableFuture class in Java which implements Future interface and CompletionStage interface tries to 
address these issues. This class provides methods like runAsync() and supplyAsync() that run a task asynchronously. 
But the biggest advantage of CompletableFuture class in Java is its ability to run a task as a series of 
stages (behavior this class gets from implementing CompletionStage) where each stage runs as a possible
asynchronous computation, that performs an action or computes a value when another CompletionStage completes.

Using CompletionStages you can create a single CompletableFuture as a chain of stages of CompletionStage 
where each stage runs when another CompletionStage completes.

*/
/*
Java CompletableFuture API – Async Variants

In CompletableFuture API most of the methods have three variants where one of them is blocking and two are 
asynchronous (methods suffixed with Async). Choose the method as per your requirement.

thenApply(Function<? super T,? extends U> fn)- Returns a new CompletionStage that, when this stage completes normally, 
is executed with this stage's result as the argument to the supplied function.

thenApplyAsync(Function<? super T,? extends U> fn)- Returns a new CompletionStage that, when this stage completes normally, 
is executed using this stage's default asynchronous execution facility, with this stage's result as the argument to the 
supplied function. Default asynchronous execution generally is a task running in the ForkJoinPool.commonPool()

thenApplyAsync(Function<? super T,? extends U> fn, Executor executor)- Returns a new CompletionStage that, 
when this stage completes normally, is executed using the supplied Executor, with this stage's result as the argument to the supplied function.

*/

/*
Difference between thenApply() and thenCompose() methods in CompletableFuture

In the Java CompletableFuture class there are two methods thenApply() and thenCompose() with a very little difference 
and it often confuses people.

thenApply()- Returns a new CompletionStage where the type of the result is based on the argument to the 
supplied function of thenApply() method.

thenCompose()- Returns a new CompletionStage where the type of the result is same as the type of the previous stage.
*/


/*
Exception handling with CompletableFuture in Java

If an exception is thrown at any of the stage with in the chain of CompletionStages the execution stops 
with in that stage and exception is thrown. For exception handling with CompletableFuture there are three 
methods handle, whenComplete and exceptionally.

Out of these three, two methods handle and whenComplete are executed regardless of exception thrown or not. 
Exception is passed as an argument is these methods which will not be null in case exception is thrown. 
Using that null check you can write your exception handling code.

That means handle() methods are allowed to return a result (in case of exception a recovering result) 
thus they can handle the exception. On the other hand, whenComplete() methods cannot return a results

Exceptionally supports computation only when the triggering stage throws an exception. 
This method also gives a chance to return a replacement result in case of exception.

*/