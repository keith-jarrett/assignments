public class SingletonDLocked
{
  public static void main(String[] args)
  {
    // note we don't use 'new' here because we cannot create a new instance
    Abc obj1 = Abc.getInstance(); // there can only be one instance for singletons
  }
}
class Abc {
  // Create a static instance of this class
  public static Abc obj;
    private Abc() // So now you cannot call Abc because it is private
    {
      System.out.println("Instance created.");
    }
    // One solution to avoid multiple threads simultaneously creating multiple singletons
    // is to use 'public static synchronized Abc getInstance()' However, 'synchornized'
    // slows the program down
    public static synchronized Abc getInstance()
    {
      if(obj == null) // this is to verify that getInstance() has not been
      // called before to get prior instances of the Singleton.
      {
        synchronized(Abc.class) // here we synchronize to make sure there aren't
        // simultaneous calls to the Singleton. Synchronize uses less resources
        // because it is used only when creating the object.
        {
          if(obj == null) // this is the double check to make sure a Singleton wasn't
          // already created.
          obj = new Abc();  // this is a lazy implementation: the Singleton isn't created
          // until getInstance() is called, thereby avoiding unnecessary memory allocation
        }
      }

      return obj;
    }
}
