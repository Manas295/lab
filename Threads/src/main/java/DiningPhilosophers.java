import java.util.Date;
import java.util.concurrent.Semaphore;
/*
 	Scenario
	Imagine five philosophers sitting around a circular table, each with a plate of food. There are five forks placed between the philosophers. Each philosopher needs two forks to eat but can only pick up one fork at a time.

	Goals
	Avoid Deadlock: Ensure that no philosopher gets stuck waiting indefinitely.

	Avoid Starvation: Ensure that no philosopher is left hungry while others continue to eat.
	
	Forks as Semaphores: Each fork is represented by a semaphore to ensure mutual exclusion.
	
	Pick Up Forks: A philosopher tries to acquire both forks before eating.
	
	Put Down Forks: After eating, the philosopher releases the forks.
	
	Dine Method: Simulates the philosopher eating and then thinking.
	
	Avoiding Deadlock
		The example uses semaphores to ensure that a philosopher can only pick up both 
		forks or none, preventing them from holding one fork while waiting for the other indefinitely.
	
	Circular Table Concept
		Philosophers and forks are arranged in a circular manner.
		Each philosopher needs to pick up two forks, one on their left and one on their right.

	Indexing
		Each philosopher is assigned an index from 0 to 4.
		Forks are also indexed from 0 to 4.

	Picking Up the Right Fork
		Left Fork: The left fork of philosopher i is simply forks[i].
		Right Fork: The right fork of philosopher i is forks[(i + 1) % 5].

	Modulo Operation
		The modulo operation (i + 1) % 5 ensures that the index wraps around to the beginning when it exceeds 
		the number of philosophers/forks.
		This is crucial for the circular arrangement, especially for the philosopher at the last index.
		Example
		Philosopher 0:
			Left Fork: forks[0]
			Right Fork: forks[(0 + 1) % 5] = forks[1]

		Philosopher 4 (last one):
			Left Fork: forks[4]
			Right Fork: forks[(4 + 1) % 5] = forks[0] (wrap-around)
 */
public class DiningPhilosophers {
	private final Semaphore[] forks = new Semaphore[5]; //Each Fork as a Semaphore:

	public DiningPhilosophers() {
		for (int i = 0; i < 5; i++) {
			forks[i] = new Semaphore(1);
		}
	}

	public void pickUpForks(int philosopher) throws InterruptedException {
		forks[philosopher].acquire(); // Pick up left fork
		forks[(philosopher + 1) % 5].acquire(); // Pick up right fork
	}

	public void putDownForks(int philosopher) {
		forks[philosopher].release(); // Put down left fork
		forks[(philosopher + 1) % 5].release(); // Put down right fork
	}

	public void dine(int philosopher) {
		try {
			pickUpForks(philosopher);
			System.out.println("Date "+new Date()
					+"Philosopher " + philosopher + " is eating.");
			Thread.sleep((int)(Math.random() * 1000)); // Simulate eating time
			putDownForks(philosopher);
			System.out.println("Date "+new Date()
					+"Philosopher " + philosopher + " is thinking.");
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}

	public static void main(String[] args) {
		DiningPhilosophers philosophers = new DiningPhilosophers();
		for (int i = 0; i < 5; i++) {
			final int philosopher = i;
			new Thread(() -> philosophers.dine(philosopher)).start();
		}
	}
}
