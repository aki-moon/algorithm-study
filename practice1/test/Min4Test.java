package algorithm.practice1.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import algorithm.practice1.src.Min4;

class Min4Test {

	@Test
	void _1番目の数字が1番小さい場合() {
		int expected = 1;
		int actual = Min4.min(1, 2, 3, 4);
		assertEquals(expected, actual);
	}

	@Test
	void _2番目の数字が1番小さい場合() {
		int expected = 1;
		int actual = Min4.min(2, 1, 3, 4);
		assertEquals(expected, actual);
	}

	@Test
	void _3番目の数字が1番小さい場合() {
		int expected = 1;
		int actual = Min4.min(2, 3, 1, 4);
		assertEquals(expected, actual);
	}

	@Test
	void _4番目の数字が1番小さい場合() {
		int expected = 1;
		int actual = Min4.min(4, 3, 2, 1);
		assertEquals(expected, actual);
	}

	@Test
	void 全ての数字が同じ場合() {
		int expected = 1;
		int actual = Min4.min(2, 1, 3, 4);
		assertEquals(expected, actual);
	}

}
