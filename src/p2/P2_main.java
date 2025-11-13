package p2;

public class P2_main {
	public static void main(String[] args) {
		int a = 3, b = 5, c = 6;
		int intResult;
		double x = 1.5, y = 2.3;
		double doubleResult; 
		
		intResult = a + b/c;
		//e) 
		doubleResult = c + (double)a/b;
		//d) doubleResult = (double)c/b;
		//f) kein Problem
		//c) doubleResult = a + (double)b/c
		System.out.print(doubleResult);
		System.out.print(intResult);
	}

}
