package final_;

public class Final_variable {
	//final int x; error 
	final int x=100;
	final static int y;
	
	void change()
	{
		//x=20; error
		//y=8;error
	}
	static {
		y=89;
	}
	
}
