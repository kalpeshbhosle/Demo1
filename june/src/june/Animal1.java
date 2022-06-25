package june;

public class Animal1 {
	public void eat() {
		System.out.println("eating....");
	}

}

class dog extends Animal1{
	public void bark() {
	System.out.println("barking....");
	}
}

class babydog extends dog{
	public void weep(){
		System.out.println("weeping....");
	}
}

class testinheritance{
	public static void main(String args[]) {
	babydog Dog = new babydog();
	Dog.eat();
	Dog.weep();
	Dog.bark();
	
	}
	
}