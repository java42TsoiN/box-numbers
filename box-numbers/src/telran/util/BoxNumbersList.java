package telran.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public abstract class BoxNumbersList extends BoxNumbersCollection {
	@Override
	public int removeRepeated() {
		HashSet<Integer> HashSet = new HashSet(collection);
		int countDeleted = collection.size() - HashSet.size();
		updateCollection(HashSet);
		return countDeleted;
	}

	private void updateCollection(HashSet<Integer> hashSet) {
		collection.clear();
		Iterator<Integer> itr = hashSet.iterator();
		while(itr.hasNext()) {
			collection.add(itr.next());
		}
		
	}
}
