package algorithm.practice1.src;

public class Sum {
	public static String printSum(int number) {
		if(number == 0) {
			return "Please specify a value greater than or equal to 1.";
		}
		StringBuilder result = new StringBuilder();
		int totalValue = 0;
		for (int i = 1; i < number + 1; i++) {
			result.append(i);
			result.append(" + ");
			totalValue += i;
		}
		result.delete(result.length() - 3, result.length());
		result.append(" = ");
		result.append(totalValue);
		return result.toString();
	}
}
