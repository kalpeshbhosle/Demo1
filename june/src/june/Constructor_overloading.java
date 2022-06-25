package june;

public class Constructor_overloading {
	int i = 9;
	int x = 8;

Constructor_overloading() {
	
	}
Constructor_overloading(int a , int b) {
		i = a;
		x = b;
		 }
	public static void main (String args[]) {
		
		Constructor_overloading obj = new Constructor_overloading();
		System.out.println(obj.i+"   and   "+obj.x);
		Constructor_overloading obj1 = new Constructor_overloading(1,2);
		System.out.println("value of a is :"+obj1.i+"value of b is :"+obj1.x);
		
	}
}
