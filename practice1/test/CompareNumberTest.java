package algorithm.practice1.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import algorithm.practice1.src.CompareNumber;

class CompareNumberTest {
	@Test
	void 小さい数字から順に数字を入力すると大きい数字を先に入力してくださいと表示されること() {
		String expected = "大きい数字を先に入力してください";
		String actual = CompareNumber.compare(5, 6);
		assertEquals(expected, actual);
	}

	@Test
	void 同じ値を入力すると大きい数字を先に入力してくださいと表示されること() {
		String expected = "大きい数字を先に入力してください";
		String actual = CompareNumber.compare(6, 6);
		assertEquals(expected, actual);
	}

	@Test
	void 大きい数字から順に数字を入力すると差分が表示されること() {
		String expected = "1";
		String actual = CompareNumber.compare(7, 6);
		assertEquals(expected, actual);
	}
}