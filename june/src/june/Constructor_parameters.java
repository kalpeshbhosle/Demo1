package june;

public class Constructor_parameters {
		int launchyear;
		String modelname;
		
		public  Constructor_parameters(int year, String name) {
			launchyear = year;
			modelname = name;
		}
	public static void main(String[] args) {
		Constructor_parameters obj = new Constructor_parameters(1999,"fararri");
		System.out.println(obj.launchyear+" "+obj.modelname);
		
		
		
	}

}
