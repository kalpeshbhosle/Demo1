package june;

import java.util.ArrayList;
import java.util.Collections;

public class arraylist {
	public static void main(String args[]) {
	ArrayList<String> colors = new ArrayList<String>();
	colors.add("yellow");
	colors.add("white");
	colors.add("green");
	colors.add("blue");
	
	System.out.println("this is my list of colors :"+colors);
	
	for(String i : colors) {
		System.out.println(i);
	}
	System.out.println("this is size of array :"+colors.size());
	colors.set(0, "pink");
	System.out.println("array : "+colors);
	
	colors.remove(0);
	System.out.println(colors);
	
	colors.add("blue");
	System.out.println(colors);
	
	colors.add("black");
	System.out.println(colors);
	
	String values = colors.get(1);
	System.out.println("second element : "+values);
	System.out.println("second element : "+colors.get(1));

	Collections.sort(colors);
	System.out.println(colors);
	
	colors.clear();
	System.out.println("removing all element from the currnet array list : "+colors);
	}
	
}
