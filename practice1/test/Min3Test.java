package algorithm.temp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Min3Test {

	@Test
	void _1番目の数字が一番小さい場合() {
		int expected = 1;
		int actual = Min3.min(1, 2, 3);
		assertEquals(expected, actual);
	}

	@Test
	void _2番目の数字が一番小さい場合() {
		int expected = 1;
		int actual = Min3.min(2, 1, 3);
		assertEquals(expected, actual);
	}

	@Test
	void _3番目の数字が一番小さい場合() {
		int expected = 1;
		int actual = Min3.min(3, 2, 1);
		assertEquals(expected, actual);
	}

	@Test
	void 全ての数字が同じ場合() {
		int expected = 1;
		int actual = Min3.min(1, 1, 1);
		assertEquals(expected, actual);
	}

}
