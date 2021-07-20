/*
 * This class prints out a pattern of '*'s and '.'s. 
 */

public class PrintStars {
	public static void main(String[] args) {
		int i, j, k;
		String star = "*";
		String period = ".";
		String space = " "; // the space is used to center the stars in a pyramid pattern
		// the next three strings are variables used with .repeat()
		String repeatStar;
		String repeatPeriod;
		String repeatSpace;
		// There are four patterns, each numbered. This for-loop is used with switch to 
		// separate the patterns.
		for (i = 1; i < 5; i++) {
			repeatPeriod = period.repeat(i + 8);
			System.out.println(String.valueOf(i) + ')');	// this outputs the integer and ')'
			switch (i) {
			case 1:				
				for (j = 1; j < 5; j++) {			// this case is for the ascending stars
					repeatStar = star.repeat(j);
					System.out.print(repeatStar);
					System.out.println();
				}
				System.out.println(repeatPeriod);
				break;
			case 2:
				System.out.println(repeatPeriod);
				for (j = 4; j > 0; j--) {			// this case is for the descending stars
					repeatStar = star.repeat(j);
					System.out.print(repeatStar);
					System.out.println();
				}
				break;
			case 3:
				for (j = 1, k = 5; j < 8; j += 2, k--) {	// this case is for the centered ascending stars
					repeatStar = star.repeat(j);
					repeatSpace = space.repeat(k);
					System.out.print(repeatSpace + repeatStar);
					System.out.println();
				}
				System.out.println(repeatPeriod);
				break;
			case 4:
				System.out.println(repeatPeriod);
				for (j = 7, k = 2; j > 0; j -= 2, k++) {	// this case is for the centered descending stars
					repeatStar = star.repeat(j);
					repeatSpace = space.repeat(k);
					System.out.print(repeatSpace + repeatStar);
					System.out.println();
				}
				break;
			}
		}
	}
}