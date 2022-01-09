package telran.util;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BoxNumbersTests {
	BoxNumbersArrayList arrayList = new BoxNumbersArrayList();
	BoxNumbersHashSet hashSet = new BoxNumbersHashSet();
	@BeforeEach
	void setUp() throws Exception {
		arrayList.addNumber(10);
		arrayList.addNumber(20);
		arrayList.addNumber(30);
		arrayList.addNumber(40);
		arrayList.addNumber(40);
		arrayList.addNumber(50);
		
		hashSet.addNumber(10);
		hashSet.addNumber(20);
		hashSet.addNumber(30);
		hashSet.addNumber(40);
		hashSet.addNumber(40);
		hashSet.addNumber(50);
	}

	@Test
	void removeTest() {
		assertTrue(arrayList.removeNumber(40));
		assertFalse(arrayList.removeNumber(35));
	}

	@Test
	void removeInRangeTest() {
		assertEquals(0, arrayList.removeInRange(0, 10));
		assertEquals(0, arrayList.removeInRange(-100, 10));
		assertEquals(3, arrayList.removeInRange(25, 45));
	}

	@Test
	void removeByPredicateTest() {
		assertEquals(1, arrayList.removeByPredicate(i -> (i == 10)));
		assertEquals(2, arrayList.removeByPredicate(i -> (i == 40)));
		assertEquals(2, arrayList.removeByPredicate(i -> (i < 40)));
		assertEquals(0, arrayList.removeByPredicate(i -> (i < 0)));
	}
	@Test
	void containsNumberTest() {
		assertTrue(arrayList.containsNumber(40));
		assertFalse(arrayList.containsNumber(35));
	}
	@Test
	void removeRepeatedTest() {
		assertEquals(1, arrayList.removeRepeated());
		assertEquals(0, hashSet.removeRepeated());
	}

}
