package algorithm.practice1.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import algorithm.practice1.src.Med3;

class Med3Test {
	@Test
	void _1と1と1が与えられた場合1が返ること() {
		int expected = 1;
		int actual = Med3.med(1, 1, 1);
		assertEquals(expected, actual);
	}

	@Test
	void _1と1と2が与えられた場合1が返ること() {
		int expected = 1;
		int actual = Med3.med(1, 1, 2);
		assertEquals(expected, actual);
	}

	@Test
	void _1と2と1が与えられた場合1が返ること() {
		int expected = 1;
		int actual = Med3.med(1, 2, 1);
		assertEquals(expected, actual);
	}

	@Test
	void _1と2と2が与えられた場合2が返ること() {
		int expected = 2;
		int actual = Med3.med(1, 2, 2);
		assertEquals(expected, actual);
	}

	@Test
	void _1と2と3が与えられた場合2が返ること() {
		int expected = 2;
		int actual = Med3.med(1, 2, 3);
		assertEquals(expected, actual);
	}

	@Test
	void _1と3と2が与えられた場合2が返ること() {
		int expected = 2;
		int actual = Med3.med(1, 3, 2);
		assertEquals(expected, actual);
	}

	@Test
	void _2と1と3が与えられた場合2が返ること() {
		int expected = 2;
		int actual = Med3.med(2, 1, 3);
		assertEquals(expected, actual);
	}

	@Test
	void _2と2と1が与えられた場合2が返ること() {
		int expected = 2;
		int actual = Med3.med(2, 2, 1);
		assertEquals(expected, actual);
	}

	@Test
	void _2と3と1が与えられた場合2が返ること() {
		int expected = 2;
		int actual = Med3.med(2, 3, 1);
		assertEquals(expected, actual);
	}


	@Test
	void _3と1と2が与えられた場合2が返ること() {
		int expected = 2;
		int actual = Med3.med(3, 1, 2);
		assertEquals(expected, actual);
	}

	@Test
	void _3と2と1が与えられた場合2が返ること() {
		int expected = 2;
		int actual = Med3.med(3, 2, 1);
		assertEquals(expected, actual);
	}

	@Test
	void _3と2と2が与えられた場合2が返ること() {
		int expected = 2;
		int actual = Med3.med(3, 2, 2);
		assertEquals(expected, actual);
	}

	@Test
	void _3と2と3が与えられた場合3が返ること() {
		int expected = 3;
		int actual = Med3.med(3, 2, 3);
		assertEquals(expected, actual);
	}
}
