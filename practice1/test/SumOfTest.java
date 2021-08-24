package algorithm.practice1.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import algorithm.practice1.src.SumOf;

class SumOfTest {
	@Test
	void _3から5までの合計が12と表示されること() {
		int actual = SumOf.sumof(3, 5);;
		assertEquals(12, actual);
	}

	@Test
	void _1から1までの合計が1と表示されること() {
		int actual = SumOf.sumof(1, 1);;
		assertEquals(1, actual);
	}
}