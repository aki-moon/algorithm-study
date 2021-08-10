package algorithm.practice1.src;

public class Max4 {

	public static int max(int i, int j, int k, int l) {
		int max = i;
		if (max < j) max = j;
		if (max < k) max = k;
		if (max < l) max = l;
		return max;
	}

}
