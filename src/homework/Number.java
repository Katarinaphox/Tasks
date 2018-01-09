package homework;

import java.util.Scanner;

public class Number {
	int c;

	public Number() {
	}

	public void createNumber() {
	}

	public int countDigits(int c) {
		int d = (int) Math.ceil(Math.log10(c + 1));
		return d;
	}

	public int sumOfDigits(int c) {
		int sum = 0;
		while (c != 0) {
			sum += c % 10;
			c /= 10;
		}
		return sum;
	}

	public int maxDigit(int c) {
		if (c == 0)
			return 0;
		return Math.max(c % 10, maxDigit(c / 10));
	}

	public int mirrorNum(int c) {
		int mirror = 0;
		while (c != 0) {
			mirror = mirror * 10 + (c % 10);
			c = c / 10;
		}
		return mirror;
	}
}
