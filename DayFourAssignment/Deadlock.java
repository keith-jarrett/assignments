public class Deadlock {
  public static void main(String[] args) {
    Movie m1 = new Movie(2020, "M1", 9.9f);
    Movie m2 = new Movie(2012, "M2", 4.9f);

    System.out.println("Deadlock Example -> start");
    Runnable t1 = new Runnable() {

      @Override
      public void run() {
        try {
          synchronized (m1) {
            Thread.sleep(100);
            synchronized (m2) {
              System.out.println("Thread 1 is running - has 2 locks");
            }
          }
        } catch (Exception e) {

        }
      }
    };
    Runnable t2 = new Runnable() {

      @Override
      public void run() {
        try {
          synchronized (m2) {
            Thread.sleep(100);
            synchronized (m1) {
              System.out.println("Thread 2 is running - has 2 locks");
            }
          }
        } catch (Exception e) {

        }
      }
    };
    new Thread(t1).start();
    new Thread(t2).start();
    System.out.println("Deadlock example -> end");
  }
}
