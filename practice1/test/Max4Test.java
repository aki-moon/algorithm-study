package algorithm.practice1.test;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import algorithm.practice1.src.Max4;

class Max4Test {
	@Test
	void _1番目の数字が一番大きい場合() {
		int actual = Max4.max(4, 3, 2, 1);
		assertEquals(4, actual);
	}

	@Test
	void _2番目の数字が一番大きい場合() {
		int actual = Max4.max(3, 4, 2, 1);
		assertEquals(4, actual);
	}

	@Test
	void _3番目の数字が一番大きい場合() {
		int actual = Max4.max(2, 3, 4, 1);
		assertEquals(4, actual);
	}

	@Test
	void _4番目の数字が一番大きい場合() {
		int actual = Max4.max(1, 3, 2, 4);
		assertEquals(4, actual);
	}

	@Test
	void 全ての数字が同じ場合() {
		int actual = Max4.max(4, 4, 4, 4);
		assertEquals(4, actual);
	}
}
