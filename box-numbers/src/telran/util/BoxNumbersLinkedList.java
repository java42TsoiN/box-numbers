package telran.util;

import java.util.Iterator;
import java.util.LinkedList;

public class BoxNumbersLinkedList extends BoxNumbersList {
	public BoxNumbersLinkedList() {
		LinkedList<Integer> linkedList = new LinkedList();
		collection = linkedList;
	}
}
