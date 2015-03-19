
public class myTime {

	private int hour;
	private int minute;
	private int second;
	
	
	public void setHour(int hour) {
		this.hour = hour;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}
	
	public void setSecond(int second) {
		this.second = second;
	}
	
	public int getHour() {
		return hour;
	}

	public int getMinute() {
		return minute;
	}

	public int getSecond() {
		return second;
	}
		
	public myTime(int h, int m, int s){
		this.setHour(((h>=0 && h<24)? h:0));
		this.setMinute(((m>=0 && m<60)? m:0));
		this.setSecond(((s>=0 && s<60)? s:0));
	}
	
	public myTime(int h, int m){
		this.setHour(((h>=0 && h<24)? h:0));
		this.setMinute(((m>=0 && m<60)? m:0));
		this.setSecond(0);
	}
	
	public myTime(int h){
		this.setHour(((h>=0 && h<24)? h:0));
		this.setMinute(0);
		this.setSecond(0);
	}
	
	public myTime(){
		this(0,0,0);
	}
	
	
	public String toString(){
		return String.format("%2d:%2d:%2d\n", getHour(), getMinute(), getSecond());
	}

	
	

	

}
