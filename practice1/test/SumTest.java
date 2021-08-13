package algorithm.practice1.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import algorithm.practice1.src.Sum;

class SumTest {
	@Test
	void _7を与えると1から7までの数式の演算結果が表示されること() {
		String expected = "1 + 2 + 3 + 4 + 5 + 6 + 7 = 28";
		String actual = Sum.printSum(7);
		assertEquals(expected, actual);
	}

	@Test
	void _1を与えると1イコール1が表示されること() {
		String expected = "1 = 1";
		String actual = Sum.printSum(1);
		assertEquals(expected, actual);
	}

	@Test
	void _0を与えると1以上の値を指定してほしい旨が表示されること() {
		String expected = "Please specify a value greater than or equal to 1.";
		String actual = Sum.printSum(0);
		assertEquals(expected, actual);
	}
}
