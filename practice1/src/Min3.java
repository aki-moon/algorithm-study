package algorithm.practice1.src;

public class Min3 {

	public static int min(int i, int j, int k) {
		int min = i;
		if(min > j) min = j;
		if(min > k) min = k;
		return min;
	}

}
