package thread_1;

public class Synchronization implements Runnable {
	int token =1;
	public void run ()
	{
		synchronized (this)
		{
			Thread t = Thread.currentThread();
			String name=t.getName();
			System.out.println(token + " ...alloted to " + name);
			token++;
		}
	}
}
