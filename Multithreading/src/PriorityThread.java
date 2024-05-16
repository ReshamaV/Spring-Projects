
public class PriorityThread extends Thread {
	public void run()
	{
		System.out.println("thread name is" +Thread.currentThread().getName());
		System.out.println("thread priority is"+Thread.currentThread().getPriority());
	}
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    PriorityThread p1=new PriorityThread();
    PriorityThread p2=new PriorityThread();
    p1.setPriority(MAX_PRIORITY);
  //  p1.setPriority(MIN_PRIORITY);
    //p1.setPriority(NORM_PRIORITY);
   // p2.setPriority(MAX_PRIORITY);
    p2.setPriority(MIN_PRIORITY);
  //  p2.setPriority(NORM_PRIORITY);
    p1.start();
    p2.start();
	}

}
