import org.junit.jupiter.api.Test;

import reactor.core.publisher.Mono;

public class MonoTest {

    @Test
    void firstMono() {
        Mono.just("A")
            .log()
            .subscribe();
    }
    
    /*OUTPUT : 
     * [ INFO] (main) | onSubscribe([Synchronous Fuseable] Operators.ScalarSubscription)
	   [ INFO] (main) | request(unbounded)
	   [ INFO] (main) | onNext(A)
	   [ INFO] (main) | onComplete()
     * 
     */

    @Test
    void monoWithConsumer() {
        Mono.just("A")
                .log()
                .subscribe(s -> System.out.println(s));
    }
    
    /*OUTPUT:
     * [ INFO] (main) | onSubscribe([Synchronous Fuseable] Operators.ScalarSubscription)
	   [ INFO] (main) | request(unbounded)
	   [ INFO] (main) | onNext(A)
	   A
	   [ INFO] (main) | onComplete()
     */

    @Test
    void monoWithDoOn() {
        Mono.just("A")
                .log()
                .doOnSubscribe(subs -> System.out.println("Subscribed: " + subs))
                .doOnRequest(request -> System.out.println("Request: " + request))
                .doOnSuccess(complete -> System.out.println("Complete: " + complete))
                .subscribe(System.out::println);
    }
    /*OUTPUT:
     * [ INFO] (main) | onSubscribe([Synchronous Fuseable] Operators.ScalarSubscription)
	   Subscribed: reactor.core.publisher.FluxPeekFuseable$PeekFuseableConditionalSubscriber@f6c48ac
	   Request: 9223372036854775807
	   [ INFO] (main) | request(unbounded)
       [ INFO] (main) | onNext(A)
       Complete: A
       A
       [ INFO] (main) | onComplete()
     * 
     */

    @Test
    void emptyMono() {
        Mono.empty()
                .log()
                .subscribe(System.out::println);
    }
    /*OUTPUT:
     * [ INFO] (main) onSubscribe([Fuseable] Operators.EmptySubscription)
	   [ INFO] (main) request(unbounded)
	   [ INFO] (main) onComplete()
     */

    @Test
    void emptyCompleteConsumerMono() {
        Mono.empty()
                .log()
                .subscribe(System.out::println,
                        null,
                        () -> System.out.println("Done")
                );
    }
    /*OUTPUT:
     * [ INFO] (main) onSubscribe([Fuseable] Operators.EmptySubscription)
 	   [ INFO] (main) request(unbounded)
	   [ INFO] (main) onComplete()
	   Done
     */

    @Test
    void errorRuntimeExceptionMono() {
        Mono.error(new RuntimeException())
                .log()
                .subscribe();
    }
    /*OUTPUT:
     *[ INFO] (main) onSubscribe([Fuseable] Operators.EmptySubscription)
	  [ INFO] (main) request(unbounded)
	  [ERROR] (main) onError(java.lang.RuntimeException)
	  [ERROR] (main)  - java.lang.RuntimeException
	  java.lang.RuntimeException
     * 
     */

    @Test
    void errorExceptionMono() {
        Mono.error(new Exception())
                .log()
                .subscribe();
    }
    /*OUTPUT:
     *[ INFO] (main) onSubscribe([Fuseable] Operators.EmptySubscription)
	  [ INFO] (main) request(unbounded)
	  [ERROR] (main) onError(java.lang.Exception)
	  [ERROR] (main)  - java.lang.Exception
	  java.lang.Exception
     * 
     */

    @Test
    void errorConsumerMono() {
        Mono.error(new Exception())
                .log()
                .subscribe(System.out::println,
                        e -> System.out.println("Error: " + e)
                );
    }
    /*[ INFO] (main) onSubscribe([Fuseable] Operators.EmptySubscription)
	  [ INFO] (main) request(unbounded)
	  [ERROR] (main) onError(java.lang.Exception)
	  [ERROR] (main)  - java.lang.Exception
	  java.lang.Exception
	  .........
	  Error: java.lang.Exception
     * 
     */

    @Test
    void errorDoOnErrorMono() {
        Mono.error(new Exception())
                .doOnError(e -> System.out.println("Error: " + e))
                .log()
                .subscribe();
    }
    /*OUTPUT
     * [ INFO] (main) onSubscribe(FluxPeek.PeekSubscriber)
	   [ INFO] (main) request(unbounded)
	   Error: java.lang.Exception
	   [ERROR] (main) onError(java.lang.Exception)
       [ERROR] (main)  - java.lang.Exception
       java.lang.Exception
     */

    @Test
    void errorOnErrorResumeMono() {
        Mono.error(new Exception())
                .onErrorResume(e -> {
                    System.out.println("Caught: " + e);
                    return Mono.just("B");
                })
                .log()
                .subscribe();
    }
    /*OUTPUT
     * [ INFO] (main) onSubscribe(FluxOnErrorResume.ResumeSubscriber)
	   [ INFO] (main) request(unbounded)
       Caught: java.lang.Exception
       [ INFO] (main) onNext(B)
       [ INFO] (main) onComplete()
     */

    @Test
    void errorOnErrorReturnMono() {
        Mono.error(new Exception())
                .onErrorReturn("B")
                .log()
                .subscribe();
    }
    /*OUTPUT
     * [ INFO] (main) onSubscribe(FluxOnErrorResume.ResumeSubscriber)
	   [ INFO] (main) request(unbounded)
	   [ INFO] (main) onNext(B)
	   [ INFO] (main) onComplete()
     */
}
