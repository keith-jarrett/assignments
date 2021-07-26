import java.util.*;

// Assignment 5: Recursion
// Given an array of ints, is it possible to choose a group of some of the
// ints, such that the group sums to the given target, with this additional
// constraint: if there are numbers in the array that are adjacent and the
// identical value, they must either all be chosen, or none of them chosen.
// For example, with the array {1, 2, 2, 2, 5, 2}, either all three 2's in the
// middle must be chosen or not, all as a group. (one loop can be used to find
// the extent of the identical values).
//
// groupSumClump(0, [2, 4, 8], 10) → true
// groupSumClump(0, [1, 2, 4, 8, 1], 14) → true
// groupSumClump(0, [2, 4, 4, 8], 14) → false

// List<Integer> g = Arrays.asList(2, 4, 8);

/*
This class SameList takes an array of integers as an argument and a starting index #.
If the index of the passed array is the beginning of a sequence of equal integers
then it will return an array with two values. The first value is the sum of them
equal integers. The second value is the index of the last number in the series
of equal numbers.
*/

class SameList {
  int[] sameNumSeq(int [] array, int k) {
      int i;      // this initializes the for loop
      int j = 0;  // sum of the consecutive numbers in an array that are equal
      int n = 0;  // the index of the last number in a consecutive sequence of same numbers
      List<Integer> sequence = new ArrayList<Integer>();  // this array will store the the consecutive integers with same value
      for (i = k; i < (array.length -1); i++) {   // length-1 to avoid going out of bounds
        if(k == 0 & (array[i] == array[i+1] )) {
          sequence.add(array[i]);
        }
        else if(array[i] != array[i+1] & array[i] == array[i-1]) {  // add to the sum if it's the last number in a consec. sec of equal integers
          n = i;  // this will be used to return where to start iterating again in the outer array
          sequence.add(array[i]);
          break;
        } else if (i == array.length -2 & array[array.length-1] == array[array.length -2]) {
          sequence.add(array[i]);
          break;
        } else if (array[i] != array[i+1]) {  // end the method if there are no more consec. equal int
          // n = i;
          break;
        } else if (array[i] == array[i+1]){
          sequence.add(array[i]); // add to the sum if
        }
      }
      for (int a : sequence) {  // this sums the consecutive equal numbers
        j += a;
      }
      int v[] = {j, n}; // the method returns j, which is the sum of equal consec. int and n, which is the index of the last equal consec int
      return v;

}
}

/*
AllNums takes an array of integers as an argument. If any series consecutive integers
in the array are equal, then they will be summed together. The class returns
an array with sums of all series of equal integers and all regular integers
*/
class AllNums{
List<Integer> theList(int [] array){
  int i;
  List<Integer> nums = new ArrayList<Integer>();
  SameList z = new SameList();
  for(i = 0; i < array.length-1; i++) {
    if (array[i] == array[i+1]) {
      nums.add(z.sameNumSeq(array, i)[0]);
      i = z.sameNumSeq(array, i)[1];
    } else {
      nums.add(array[i]);
    }
    }
  if (array[array.length - 1] != array[array.length - 2]){
    nums.add(array[array.length - 1]);
  }
  // for(int f : nums) {
  //   System.out.print(f);
  //   System.out.println();
  // }
  return nums;
}
}

/*
SumToNum takes two arguments. The first is an integer array, and the second is
a target number. If any two numbers in the parameter array add to the target
number, then it will return true. It creates instances of the classes SameList
and AllNums in order to sum together any series of consecutive integers that
have the same value.
*/
class SumToNum {
  boolean areThereNums(int [] array, int target) {
    AllNums getList = new AllNums();
    List<Integer> finalList = getList.theList(array);
    boolean answer = false;
    int i;
    int j;
    for (i = 0; i < finalList.size(); i++) {
      for (j = i+1; j < finalList.size(); j++) {
        if (finalList.get(i) + finalList.get(j) == target) answer = true;
      }
    }
    return answer;
  }
}

class Recursion1 {

  public static void main(String[] args) {
    int target = 17;
    int g[] = {7, 7, 3, 8, 8, 4};
    SumToNum test1 = new SumToNum();
    boolean answer = test1.areThereNums(g, target);
    System.out.println("Are there two numbers that add to " + target + "? " + answer);
    }
  }
