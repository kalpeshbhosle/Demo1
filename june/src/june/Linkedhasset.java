package june;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class Linkedhasset {

	public static void main(String[] args) {
		
			//Vector<String> al=new Vector<String>();  // vector is having methods which are not part of coolection frmwrk
		//	ArrayList<String>al=new ArrayList<String>();//it is used sotre the element dynamically
			//LinkedList<String> set=new LinkedList<String>();//elements are stored in the doubly linklist it is fstter linking is not
			HashSet<String> set=new HashSet<String>();
			set.add("Ravi");  
			set.add("Vijay");  
			set.add("Ravi");  
			set.add("Ajay"); 
			set.add("Ajay");
			set.add(null);

			Iterator<String> itr=set.iterator();  
			while(itr.hasNext()){  
			System.out.println(itr.next());  
			}  
			}

	}


