public class NumberFun {
	public static long findNextSquare(long sq) {
		long sqrt = (long) Math.sqrt(sq);
		if (sqrt * sqrt == sq) {
			sqrt += 1;
			long nextSq = sqrt * sqrt;
			return nextSq;
		}
		else {
			return -1;
		}
	}
}
