package homework;

import java.util.Scanner;

public class Rectangle {
	public int a, b;

	public Rectangle() {
	}

	public void drawRectangle() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your size of Rectangle:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void drawAnotherRectangle() {
		System.out.println("Enter your size of Rectangle:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				if (inRectangle(i, j, a, b)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static boolean inRectangle(int i, int j, int a, int b) {
		return i == 0 || i == a - 1 || j == 0 || j == b - 1;

	}
}
