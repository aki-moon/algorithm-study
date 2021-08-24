package algorithm.practice1.src;

public class SumOf {

	public static int sumof(int start, int end) {
		int sum = 0;
		for (int i = start; i <= end; i++) {
			sum += i;
		}
		return sum;
	}

}
