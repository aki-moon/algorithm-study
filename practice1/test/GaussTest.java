/**
 *
 */
package algorithm.practice1.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import algorithm.practice1.src.Gauss;

class GaussTest {
	@Test
	void _1から10までの総和が55と計算されること() {
		int expected = 55;
		int actual = Gauss.sum(10);
		assertEquals(expected, actual);
	}

	@Test
	void _1から9までの総和が45と計算されること() {
		int expected = 45;
		int actual = Gauss.sum(9);
		assertEquals(expected, actual);
	}
}
