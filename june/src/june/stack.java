package june;

import java.util.Iterator;
import java.util.Stack;

public class stack {

	public static void main(String[] args) {
		Stack<String> stck = new Stack<String>();
		stck.push("a");
		stck.push("b");
		stck.push("c");//last in first out after using pop method last element will be deleted 
		stck.pop();
		Iterator<String> itr = stck.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

 	}

}
