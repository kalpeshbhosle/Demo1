package june;

 interface firstinterface {
	 public void firstmethod();
}

 interface secondinterface{
	 public void secondmethod();
	 
 }
 class firstclass implements firstinterface,secondinterface{
	 public void firstmethod() {
		 System.out.println("this is my first mehthod");
	 }
	 public void secondmethod() {
		 System.out.println("this is my second method");
	 }
 }
 class main2 {
	 public static void main (String args[]) {
		 firstclass ft = new firstclass();
			 ft.firstmethod();
			 ft.secondmethod();
		 
		 
	 }
 }