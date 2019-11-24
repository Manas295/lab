
public class Apple {
	private int id;
	
	private int weight;

	public Apple(int id, int weight) {
		super();
		this.id = id;
		this.weight = weight;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Apple [id=" + id + ", weight=" + weight + "]";
	}
	
	
}
