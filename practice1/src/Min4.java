package algorithm.practice1.src;

public class Min4 {

	public static int min(int i, int j, int k, int l) {
		int min = i;
		if(min > j) min = j;
		if(min > k) min = k;
		if(min > l) min = l;
		return min;
	}

}
