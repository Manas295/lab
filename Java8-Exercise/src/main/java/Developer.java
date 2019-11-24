
import java.util.List;

public class Developer {
	
	private String name;
	
	public Developer(String name, List<String> skillsList) {
		super();
		this.name = name;
		this.skillsList = skillsList;
	}

	@Override
	public String toString() {
		return "Developer [name=" + name + ", skillsList=" + skillsList + "]";
	}

	private List<String> skillsList;

	public List<String> getSkillsList() {
		return skillsList;
	}

	public void setSkillsList(List<String> skillsList) {
		this.skillsList = skillsList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
