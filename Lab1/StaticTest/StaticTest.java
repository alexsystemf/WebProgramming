public class StaticTest {
	  public static int i = 10; // static attribute
	  
	  public static void init() {
	     i = 10;
	  }
	  
	  public static void main(String[] args) {
	     StaticTest  a = new StaticTest();
	     StaticTest  b = new StaticTest();
	     a.i++;
	     System.out.println(a.i);
	    
	     b.i++;
	     System.out.println(b.i);
	     
	     a.i++;
	     System.out.println(a.i);
	     
	     init(); //or StaticTest.init()
	     System.out.println(a.i);
	     
	  }
}