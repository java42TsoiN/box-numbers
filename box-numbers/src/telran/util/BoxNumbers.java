package telran.util;

import java.util.function.Predicate;

public interface BoxNumbers extends Iterable<Integer> {
	/**
	 * 
	 * @param number
	 * @return true if number is added
	 */
	boolean addNumber(int number);
	/**
	 * 
	 * @param number
	 * @return true if number is removed
	 */
	boolean removeNumber(int number);
	/**
	 * 
	 * @return count of removed elements
	 */
	int removeRepeated();
	/**
	 * 
	 * @param predicate
	 * @return count of removed elements
	 */
	int removeByPredicate(Predicate<Integer> predicate);
	/**
	 * 
	 * @param min inclusive
	 * @param max exclusive
	 * @return count of removed elements
	 */
	int removeInRange(int min, int max);
	/**
	 * 
	 * @param number
	 * @return true if number is exists
	 */
	boolean containsNumber(int number);
}
