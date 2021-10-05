package algorithm.practice1.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import algorithm.practice1.src.Square;

class SquareTest {
	@Test
	void _1を入力した場合() {
		String actual = Square.drow(1);
		assertEquals("*", actual);
	}

	@Test
	void _2を入力した場合() {
		String actual = Square.drow(2);
		assertEquals("**" + "\n" + "**", actual);
	}

	@Test
	void _3を入力した場合() {
		String actual = Square.drow(3);
		assertEquals("***" + "\n" + "***" + "\n" + "***", actual);
	}
}