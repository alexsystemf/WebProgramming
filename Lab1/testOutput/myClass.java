
public class myClass {
	
	private String helloMessage;
	
	public myClass(String msg){
		helloMessage = msg;
	}
	
	public myClass(String msg1, String msg2){
		this.helloMessage = msg1 + msg2;
	}
	
	
	public void setMyClass(String msg){
		helloMessage = msg;
	}
	
	public String getMyClass (){
		return helloMessage;
	}
	
	public String toString(){
		return String.format("This is the print of the classes variable HelloMessage: %s\n", helloMessage);
	}
	
}
