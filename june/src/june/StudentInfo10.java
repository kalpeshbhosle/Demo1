package june;

public class StudentInfo10 {

	public static void main(String[] args) {
		StudentInfo[] s1 = new StudentInfo[10];
		s1[0] = new StudentInfo("ram", 23,"pune");
		s1[1] = new StudentInfo("lakhan", 22,"pune");
		s1[2] = new StudentInfo("kalpesh", 21,"pune");
		s1[3] = new StudentInfo("ajit", 24,"pune");
		s1[4] = new StudentInfo("sarla", 25,"pune");
		s1[5] = new StudentInfo("shital", 26,"pune");
		s1[6] = new StudentInfo("pradip", 27,"pune");
		s1[7] = new StudentInfo("akash", 28,"pune");
		s1[8] = new StudentInfo("anuradha", 29,"pune");
		s1[9] = new StudentInfo("priyaka", 3,"pune");
		
		for (int i = 0; i<10; i++) {
			s1[i].setInfo();
		}

	}

}
