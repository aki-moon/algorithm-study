package algorithm.practice1.src;

public class CompareNumber {
	public static String compare(int a, int b) {
		if (b >= a) {
			return "大きい数字を先に入力してください";
		}
		return String.valueOf(a - b);
	}
}
