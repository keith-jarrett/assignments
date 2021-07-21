// Take multiple values from the command line and show the result of adding all of them.
// Keith Jarrett
// From Jul 20 Java class

public class AddInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int runningTotal = 0;
    try {
		for ( int i=0; i < args.length; i++) {
      Integer userInput = Integer.valueOf(args[i]);
			runningTotal += userInput;
		}
		System.out.println("The sum of your numers is " + runningTotal);
  } catch (NumberFormatException n) {
    System.out.println("Program only takes integer input.");
    System.out.println("Exception caught: " + n);
  }
	}
}