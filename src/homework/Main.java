package homework;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Enter the number of task from 1 to 29");
		Scanner sc = new Scanner(System.in);
		int answer = sc.nextInt();
		switch (answer) {
		case 1:
			Rectangle r = new Rectangle();
			r.drawRectangle();
			break;
		case 2:
			Rectangle r1 = new Rectangle();
			r1.drawAnotherRectangle();
			break;
		case 3:
			Number first = new Number();
			System.out.println("Enter the integer:");
			int c = sc.nextInt();
			System.out.println(c);
			first.createNumber();
   
			int v = first.countDigits(c);
            System.out.println(v);
            
            int j = first.sumOfDigits(c);
            System.out.println(j);
            
            int x = first.maxDigit(c);
            System.out.println(x);
            
            int l = first.mirrorNum(c);
            System.out.println(l);
            break;
		case 4:
			Triangle isos = new Triangle();
			isos.drawTriangle();
		}
	}
}
