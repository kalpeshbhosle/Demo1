package june;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		LinkedList<String> name = new LinkedList<String>();
		name.add("a");
		name.add("b");
		name.add("c");
		name.add("d");
		Iterator itr = name.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

}
}