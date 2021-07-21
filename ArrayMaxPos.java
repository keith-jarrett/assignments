/*  Keith Jarrett
	July 20 Assignment 2
 	Construct a 2D array and find the max number and show its position in the array.
*/

import java.util.Random;

class ArrayMaxPro {
	public static void main(String[] args) {
		Random rand = new Random();

		int a, b, i, j;
		int max;
		max = 0;
		a = 0;
		b = 0;
		int twoDArray[][] = new int[5][2];
		for (i = 0; i < 5; i++) {
			for (j = 0; j < 2; j++) {
				int rand_int = rand.nextInt(100);
				twoDArray[i][j] = rand_int;
			}

		}
		for (i = 0; i < 5; i++) {
			for (j = 0; j < 2; j++) {
				System.out.print(twoDArray[i][j] + " ");
			}
			System.out.println();
		}
		for (i = 0; i < 5; i++) {
			for (j = 0; j < 2; j++) {
				if (twoDArray[i][j] > max) {
					max = twoDArray[i][j];
					a = i;
					b = j;
				}
			}
		}
		System.out.println("\nThe max is: " + max);
		System.out.println("The location is twoDArray[" + a + "]" + "[" + b + "]");
	}
}