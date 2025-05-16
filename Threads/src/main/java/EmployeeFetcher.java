import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EmployeeFetcher {
    private static final int BATCH_SIZE = 100; // API limit
    private static final int TOTAL_EMPLOYEES = 30000; // Example size
    private static final int THREAD_POOL_SIZE = 10;

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(THREAD_POOL_SIZE);
        List<CompletableFuture<List<Employee>>> futures = new ArrayList<>();
		
        // Divide the total employees into batches and fetch concurrently
        for (int offset = 0; offset < TOTAL_EMPLOYEES; offset += BATCH_SIZE) {
            int currentOffset = offset; // Required for lambda
            CompletableFuture<List<Employee>> future = CompletableFuture.supplyAsync(() -> {
                return fetchEmployeesFromApi(currentOffset, BATCH_SIZE);
            }, executor);
            futures.add(future);
        }

        // Combine all results
        List<Employee> allEmployees = futures.stream()
                .map(CompletableFuture::join) // Wait for each future to complete
                .flatMap(List::stream)        // Combine all results into a single stream
                .toList();

        executor.shutdown();
        System.out.println("Total employees fetched: " + allEmployees.size());
    }

    private static List<Employee> fetchEmployeesFromApi(int offset, int limit) {
        // Simulate API call
        System.out.println("Fetching employees from offset: " + offset + " with limit: " + limit);
        List<Employee> employees = new ArrayList<>();
        for (int i = 0; i < limit; i++) {
            employees.add(new Employee("Employee-" + (offset + i)));
        }

        try {
            Thread.sleep(200); // Simulate network delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return employees;
//        try {
//            Thread.sleep(200); // Simulate network delay
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        return List.of(new Employee("Employee-" + offset)); // Dummy response
    }

}


class Employee {
    private String name;
    public Employee(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}