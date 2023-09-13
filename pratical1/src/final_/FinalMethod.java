package final_;

public class FinalMethod {
	FinalMethod(){
		System.out.println("default constructor");
	}
	final int a=22;
	
	void display(){
		System.out.println("display");
	}
	final void show() {
		System.out.println("a"+ a);
	}
}
