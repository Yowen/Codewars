public class XO {
	public static boolean getXO(String input) {
		int x = 0, o = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.toUpperCase().charAt(i) == 'X') {
				x++;
			}
			else if (input.toUpperCase().charAt(i) == 'O') {
				o++;
			}
		}
		return x == o;	
	}
}
