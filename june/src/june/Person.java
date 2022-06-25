package june;

public class Person {
	private String name;
	
	public String SetName() {
		return name;
	}
	public void GetName(String newname) {
		this.name= newname;
	}
	public static void main(String args[]) {
		Person ps = new Person();
		ps.GetName("geeta");
		System.out.println(ps.SetName());
	}
}
