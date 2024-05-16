
public class DaemonThread extends Thread {
	public void run()
	{
		System.out.println("Deamon thread started" +Thread.currentThread());
		if(Thread.currentThread().isAlive())
			System.out.println("Daemon Thread is alive");
		else
			System.out.println("user thread is alive");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("main start");
    DaemonThread d=new DaemonThread();
    d.setDaemon(true);
    d.start();
    try
    {
    	Thread.sleep(500);
    }
    catch(InterruptedException ie)
    {
    }
    System.out.println("Leaving main method");
	}
}
