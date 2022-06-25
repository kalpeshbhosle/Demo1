package june;

public class StudentInfo {
	private String name;
	private int rollno;
	private String addrs;
	
	StudentInfo(){
		name = "Unkown";
		rollno = 0;
		addrs = "not available";
	}
		StudentInfo (String aname, int rollNo,String address){
			this.name = aname;
			this.rollno = rollNo;
			this.addrs = address;
			
		}
		public void setInfo() {
			System.out.println("name of student   : "+name + " rollno :"+rollno+"    address  :  "+addrs);
		}

}
