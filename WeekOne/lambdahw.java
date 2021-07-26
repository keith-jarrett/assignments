// Assignment 1: Lambdas
// Write the following methods that return a lambda expression performing a specified action:
//
// PerformOperation isOdd(): The lambda expression must return  if a number is odd or  if it is even.
interface PerformOperation1 {
  boolean isOdd(int n);
}

// PerformOperation isPrime(): The lambda expression must return  if a number is prime or  if it is composite.
interface PerformOperation2 {
  boolean isPrime(int n);
}

// PerformOperation isPalindrome(): The lambda expression must return  if a number is a palindrome or  if it is not.
interface PerformOperation3 {
  boolean isPalindrome(int n);
}

class lambdahw {
  public static void main (String[] args) {
    int n = Integer.parseInt(args[0]);
    PerformOperation1 op = (a) -> (a%2) != 0;
    boolean answer = op.isOdd(n);
    System.out.println(n + " is odd: " + answer);

    PerformOperation2 pn =  (a) -> {
      for (int i = 2; i * i <= a; i++) {
                if (a % i == 0) {
                    return false;
                }
            }
            return true;
      };
    boolean answer2 = pn.isPrime(n);
    System.out.println(n + " is prime: " + answer2);

    PerformOperation3 pal =  a -> a == Integer.parseInt(new StringBuilder(String.valueOf(a)).reverse().toString());
    boolean answer3 = pal.isPalindrome(n);
    System.out.println(n + " is palindrome: " + answer3);

  }
}
// Input Format
//
// Input is handled for you by the locked stub code in your editor.
//
// Output Format
//
// The locked stub code in your editor will print  lines of output.

// Sample Input
//
// The first line contains an integer,  (the number of test cases).
//
// The  subsequent lines each describe a test case in the form of  space-separated integers:
// The first integer specifies the condition to check for ( for Odd/Even,
// for Prime, or  for Palindrome). The second integer denotes the number to be checked.
//
// 5
// 1 4
// 2 5
// 3 898
// 1 3
// 2 12
//
// Sample Output
//
// EVEN
// PRIME
// PALINDROME
// ODD
// COMPOSITE
