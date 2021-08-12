package algorithm.practice1.src;

public class Med3 {

	public static int med(int i, int j, int k) {
		if (i >= j) {
			if (j >= k) {
				return j;
			} else if (i <= k) {
				return i;
			} else {
				return k;
			}
		} else if (i > k) {
			return i;
		} else if (j > k) {
			return k;
		} else {
			return j;
		}
	}
}
