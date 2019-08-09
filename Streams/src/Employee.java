class Employee {
 @Override
	public String toString() {
		return "Employee [empId=" + empId + ", age=" + age + ", name=" + name + ", sex=" + sex + ", salary=" + salary
				+ "]";
	}
private String empId;
 private int age;
 private String name;
 private char sex;
 private int salary;
 Employee(String empId, int age, String name, char sex, int salary){
  this.empId = empId;
  this.age = age;
  this.name = name;
  this.sex = sex;
  this.salary = salary;
 }
 public String getEmpId() {
  return empId;
 }
 public void setEmpId(String empId) {
  this.empId = empId;
 }
 public int getAge() {
  return age;
 }
 public void setAge(int age) {
  this.age = age;
 }
 public String getName() {
  return name;
 }
 public void setName(String name) {
  this.name = name;
 }
 public char getSex() {
  return sex;
 }
 public void setSex(char sex) {
  this.sex = sex;
 }
 public int getSalary() {
  return salary;
 }
 public void setSalary(int salary) {
  this.salary = salary;
 } 
}