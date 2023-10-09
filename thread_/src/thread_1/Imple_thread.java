package thread_1;

public class Imple_thread implements Runnable {

	public void run() {
		System.out.println("By using Runnable interface");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Imple_thread t =new Imple_thread();
		Thread t1= new Thread(t);
		t1.start();
		System.out.println(t1.getPriority());
		System.out.println(t1.getName());
		System.out.println(t1.currentThread());
		
		System.out.println("\nSynchronized Block.........................................................\n");
		Synchronization ob= new Synchronization();
		Thread T1= new Thread(ob);
		Thread T2= new Thread(ob);
		Thread T3= new Thread(ob);
		T1.setName("Ticket 1");
		T2.setName("Ticket 2");
		T3.setName("Ticket 3");
		T1.start();
		T2.start();
		T3.start();

	}

}
