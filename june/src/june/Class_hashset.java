package june;

import java.util.HashSet;

public class Class_hashset {

	public static void main(String[] args) {
		HashSet<String> treeset = new HashSet<String>();
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


