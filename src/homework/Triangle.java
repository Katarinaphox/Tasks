package homework;

import java.util.Scanner;

public class Triangle {
int n;

	public Triangle() {
	}
	public void drawTriangle() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of rows/height:");
		int n = sc.nextInt();
		

	    for (int i = 1; i < (2 * n); i++)
	    {
	        for (int j = 1; j <= i && j <= (2 * n) - i; j++)
	        {
	            System.out.print(j + " ");
	        }
	        System.out.println();
	    }
	}
	}

