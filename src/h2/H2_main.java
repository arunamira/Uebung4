package h2;

public class H2_main {
	public static void main(String[] args) {
		boolean x = true, y = true;
		boolean a = false, b = false, c = false;
		int input = 11;

		// input hat die Werte 0, 1, 10, oder 11
		// E1: x ist wahr (true)
		// E2: y ist wahr (true)
		// E3: die Werte von x und y sind unterschiedlich

		if (input == 10 || input == 11) {
			x = true;
		} else {
			x = false;
		}
		if (input == 1 || input == 11) {
			y = true;
		} else {
			y = false;
		}

		if (x && y) {
			a = true;
		} else {
			a = false;
		}

		if (x || (x != y)) {
			b = true;
		} else {
			b = false;
		}

		if (!y) {
			c = true;
		} else {
			c = false;
		}

		System.out.println("Input = " + input);
		System.out.println("y ist " + y);
		System.out.println("x ist " + x);
		System.out.println("a ist " + a);
		System.out.println("b ist " + b);
		System.out.println("c ist " + c);

	}

}
