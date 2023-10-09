package thread_1;

public class Extend_ extends Thread {
	
	public void run() {
		System.out.println("By using Extend Thread class");
	}
	
	public static void main(String[] args) {
	Extend_ t=new Extend_();
	t.start();
	}
}
