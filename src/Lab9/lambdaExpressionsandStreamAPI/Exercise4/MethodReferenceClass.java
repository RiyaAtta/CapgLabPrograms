package Lab9.lambdaExpressionsandStreamAPI.Exercise4;

public class MethodReferenceClass {
	private int age;
	private String name;
	public MethodReferenceClass(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	public MethodReferenceClass() {
		super();
	}
	@Override
	public String toString() {
		return "MethodReferenceClass [age=" + age + ", name=" + name + "]";
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
	

}