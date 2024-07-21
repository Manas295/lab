package stream.apis.question;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FilterOutTransactionOfSpecificType {
public static void main(String[] args) {
	List<Transaction> transactions = Arrays.asList(
            new Transaction("deposit", 100.0),
            new Transaction("withdrawal", 50.0),
            new Transaction("deposit", 200.0),
            new Transaction("transfer", 150.0)
    );
    String targetType = "deposit";
    
    Set<Transaction> depositTypeTrans = transactions.stream().filter(trans -> trans.getType().equals(targetType))
    .collect(Collectors.toSet());
    System.out.println(depositTypeTrans);
}
}
