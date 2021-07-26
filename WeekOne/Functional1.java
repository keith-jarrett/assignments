// Assignment 1 - 3 Functional
import java.lang.String;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
import java.util.*;
import java.nio.file.*;
import java.io.IOException;

// Assignment 2: Functional
// Given a list of non-negative integers, return an integer list of the rightmost digits. (Note: use %)
//
// rightDigit([1, 22, 93]) → [1, 2, 3]
// rightDigit([16, 8, 886, 8, 1]) → [6, 8, 6, 8, 1]
// rightDigit([10, 0]) → [0, 0]


class getRightDigit {
  // List<Integer> rightDigit(int [] array) {
  void rightDigit(int [] array) {

    List<Integer> values = IntStream.of(array)
      .boxed().collect(Collectors.toList());
    System.out.print("[");
		values
			.stream()
			.map(x -> x % 10)
			// .forEach(System.out::println);
      .forEach(x -> System.out.print(x + ", "));
      System.out.println("]");

    // return values;
  }
}

// Assignment 3: Functional
// Given a list of integers, return a list where each integer is multiplied by 2.
//
// doubling([1, 2, 3]) → [2, 4, 6]
// doubling([6, 8, 6, 8, -1]) → [12, 16, 12, 16, -2]
// doubling([]) → []
class doubleIt {
  // List<Integer> doubling(int [] array) {
  void doubling(int [] array) {

    List<Integer> values1 = IntStream.of(array)
      .boxed().collect(Collectors.toList());
  // List<Integer> d = Arrays.asList(2, 4, 8);
    System.out.print("[");
    values1
    .stream()
    .map(x -> x * 2)
    .forEach(x -> System.out.print(x + ", "));
    System.out.println("]");
    // return values1;

}
}

// Assignment 4: Functional
// Given a list of strings, return a list where each string has all its "x" removed.
//
// noX(["ax", "bb", "cx"]) → ["a", "bb", "c"]
// noX(["xxax", "xbxbx", "xxcx"]) → ["a", "bb", "c"]
// noX(["x"]) → [""]

class removeX {
  void noX(String[] array) {
    // List<String> j = Arrays.asList("xxax", "xbxbx", "xxcx");
    // List<String> values2 = Arrays.stream(array).boxed().collect(Collectors.toList());
    List<String> values2 = Arrays.asList(array);

    System.out.print("[");
    values2
      .stream()
      .map(x -> x.replace("x", ""))
      .forEach(x -> System.out.print(x + ", "));
      System.out.println("]");
  }
}

class Functional1 {
  public static void main(String[] args) {

    // Calling Assignment1. This will return the rightmost digit of each element.
    getRightDigit rd = new getRightDigit();
    int cat[] = {16, 8, 886, 8, 1};
    // for (int a : rd.rightDigit(cat)) System.out.print(a);
    rd.rightDigit(cat);

    // Calling Assignment3, double each element
    int dog[] = {3, 6, 9};
    doubleIt di = new doubleIt();
    // for (int a : di.doubling(dog)) System.out.print(a);
    di.doubling(dog);

    // Calling Assignment 4, remove each x
    String mouse[] = {"xxax", "xbxbx", "xxcx"};
    removeX rx = new removeX();
    rx.noX(mouse);
}
}
