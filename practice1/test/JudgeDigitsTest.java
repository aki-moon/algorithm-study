package algorithm.practice1.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import algorithm.practice1.src.JudgeDigits;
class JudgeDigitsTest {
	@Test
	void _0を入力すると1が返ってくること() {
		int actual = JudgeDigits.digits(0);
		int expected = 1;
		assertEquals(expected, actual);
	}

	@Test
	void _100を入力すると3が返ってくること() {
		int actual = JudgeDigits.digits(100);
		int expected = 3;
		assertEquals(expected, actual);
	}

	@Test
	void _999999999を入力すると3が返ってくること() {
		int actual = JudgeDigits.digits(999999999);
		int expected = 9;
		assertEquals(expected, actual);
	}
}