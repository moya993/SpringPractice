package Pack01;

public class Person {
	String name;
	int age;
	
	
	public Person() { System.out.println("생성자콜");}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
