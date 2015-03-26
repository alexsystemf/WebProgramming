import java.io.IOException;


public class KeyBoardReaderMain {
	
	static private String s;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		KeyboardReader k = new KeyboardReader();
		
		try {
			s = k.getPromptedString("Give a string");
			System.out.println(" You wrote: " + s);
		}
		catch (IOException e){
			e.getStackTrace();
		}
		

	}

}
