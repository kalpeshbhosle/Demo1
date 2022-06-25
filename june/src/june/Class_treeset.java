package june;

import java.util.TreeSet;

public class Class_treeset {

	public static void main(String[] args) {
		TreeSet<String> treeset = new TreeSet<String>();
	      treeset.add("Good");
	      treeset.add("For");
	      treeset.add("Health");
	      //Add Duplicate Element
	      treeset.add("Good");
	      System.out.println("TreeSet : ");
	      for (String temp : treeset) {
	         System.out.println(temp);
	      }
	   }
	}


