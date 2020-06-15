package pl.szymonleyk.junit;

public class Calculator {

	public static int add(int... liczby) {
		int result = 0;
		for (int liczba : liczby) {
			result += liczba;
		}
		return result;
	}

	public static int substract(int... liczby) {
		int result = liczby[0];
		for (int i = 1; i < liczby.length; i++) {
			result -= liczby[i];
		}
		return result;
	}

	public static double divide(int i, int j) {
		return (double) i / j;
	}

	public static int multiple(int... liczby) {
		int result = 1;
		for (int liczba : liczby) {
			result *= liczba;
		}
		return result;
	}

}
