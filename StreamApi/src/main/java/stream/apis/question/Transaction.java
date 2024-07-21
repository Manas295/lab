package stream.apis.question;
class Transaction {

	private String type;

	private double amount;
	// Constructor, getters, and setters
	public Transaction(String type, double amount) {
		this.type = type;
		this.amount = amount;
	}

	public String getType() {
		return type;
	}

	public double getAmount() {
		return amount;
	}

	@Override
	public String toString() {
		return "Transaction{" +
				"type='" + type + '\'' +
				", amount=" + amount +
				'}';
	}
}