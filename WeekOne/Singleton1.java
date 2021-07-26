// Assignment 6: Singleton
// Fix the below Singleton class:

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


// public static class SampleSingleton {
class SampleSingleton {
  

	private static SampleSingleton instance = null;  // keep

  private SampleSingleton()
  {
      Connection conn = null;
  }

	public static SampleSingleton getInstance() {
    if (instance == null)
      instance = new SampleSingleton();
		return instance;
	}

}


class Singleton1 {
  public static void main (String[] args) {
    SampleSingleton x = SampleSingleton.getInstance();
    SampleSingleton y = SampleSingleton.getInstance();
    SampleSingleton z = SampleSingleton.getInstance();
    System.out.println(x);
    System.out.println(y);
    System.out.println(z);
    // make some change to x, but I don't know how to change a null value.
    // The following should all have the same value.
    System.out.println(x);
    System.out.println(y);
    System.out.println(z);
  }
}
