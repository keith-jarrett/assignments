import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class test {

 public static void main(String[] args) {
  BufferedReader objReader = null;
  try {
   String strCurrentLine;
   long total = 0;
   // read the object in and store in an object
   objReader = new BufferedReader(new FileReader("textfile.txt"));

  // This reads through the file line by line.
   while ((strCurrentLine = objReader.readLine()) != null) {
     // this counts the number of occurences of the given character.
     // .chars() returns in integer stream. Each integer is the unicode Integer
     // value for each character.
     // .filter() returns a stream that matches the condition in the parenthesis
     // .count() counts the number of elements in a stream. It is type long,
     // that's why the return value of this is long.
    long count = strCurrentLine.chars().filter(ch -> ch == 'e').count();

    total += count;
   }
   System.out.println("The character 'e' appears in the text " + total + " times.");
  } catch (IOException e) {

   e.printStackTrace();

  } finally {
    // close the object.
   try {
    if (objReader != null)
     objReader.close();
   } catch (IOException ex) {
    ex.printStackTrace();
   }
  }
 }
}
