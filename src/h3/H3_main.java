package h3;

public class H3_main {
	public static void main(String[] args) {
		float celsiusFloat = 14.2f, fahrenheitFloat = 3.85f;
		double celsiusDouble = 14.2, fahrenheitDouble = 8.1;

		fahrenheitFloat = celsiusFloat * 9 / 5 + 32;
		fahrenheitDouble = celsiusDouble * 9 / 5 + 32;

		System.out.println("fahrenheitDouble = " + fahrenheitDouble);
		System.out.println("fahrenheitFloat = " + fahrenheitFloat);
	}
}
