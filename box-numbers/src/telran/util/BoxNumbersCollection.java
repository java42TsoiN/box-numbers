package telran.util;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;

public abstract class BoxNumbersCollection implements BoxNumbers{
	protected  Collection<Integer> collection;
	public boolean addNumber(int number) {
		collection.add(number);
		return true;
	}


	public boolean removeNumber(int number) {
		return collection.remove(number);
	}

	
	public int removeByPredicate(Predicate<Integer> predicate) {
		int sizeBeforeRemove=collection.size();
		collection.removeIf(predicate);
		return sizeBeforeRemove-collection.size();
	}

	public int removeInRange(int min, int max) {
		return removeByPredicate(num->num>=min&&num<max);
	}

	public boolean containsNumber(int number) {
		return collection.contains(number);
	}
	@Override
	public Iterator<Integer> iterator() {
		return collection.iterator();
	}
	
}
