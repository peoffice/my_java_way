package mark.workspace.netty_tutorial;

import java.util.Date;

public class Time {
	private final long value;
	public Time(){
		this(System.currentTimeMillis()/1000);
	}
	public Time(long value){
		this.value = value;
	}
	public long value(){
		return value;
	}
	
	@Override
	public String toString(){
		return new Date((value())*1000L).toString();
	}
}
