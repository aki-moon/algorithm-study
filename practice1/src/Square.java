package algorithm.practice1.src;

public class Square {

	public static String drow(int edge) {
		StringBuffer aster = new StringBuffer();
		for (int i = 0; i < edge; i++) {
			aster.append("*");
		}
		stretch(aster, edge);
		return aster.toString();
	}

	private static void stretch(StringBuffer aster, int edge) {
		String orgAster = aster.toString();
		for (int j = 0; j < edge - 1; j++) {
			aster.append("\n");
			aster.append(orgAster);
		}
	}
}