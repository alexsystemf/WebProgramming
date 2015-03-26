import java.io.*;

public class KeyboardReader {
	private BufferedReader in;
  
	public KeyboardReader() {
		in = new BufferedReader(new InputStreamReader(System.in));
	}
  
	public String getPromptedString(String prompt) throws IOException {
		System.out.print(prompt);
		return in.readLine();
	}

	public char getPromptedChar(String prompt) throws IOException {
		System.out.print(prompt);
		return in.readLine().charAt(0);
	}
    
	public int getPromptedInt(String prompt) throws IOException {
		System.out.print(prompt);
		return Integer.parseInt(in.readLine());
	}
  
	public float getPromptedFloat(String prompt) throws IOException {
		System.out.print(prompt);
		return Float.parseFloat(in.readLine());
	}
	public double getPromptedDouble(String prompt) throws IOException {
		System.out.print(prompt);
		return Double.parseDouble(in.readLine());
	}

}