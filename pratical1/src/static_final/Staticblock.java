package static_final;

public class Staticblock {
	private int section;
	private static int srno;
	
	static {
		System.out.println("Static block");
		srno=1000;
	}

	Staticblock(){
		System.out.println("default constructor");
		section++;
		srno++;
	}
	static void display() {
		System.out.println("Serial no" + srno);
	}
}
