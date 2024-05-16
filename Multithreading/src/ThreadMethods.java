
public class ThreadMethods extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread run");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1= new Thread();
        Thread t2= new Thread();

        t1.run();
        System.out.println("t1 thread priority:"+t1.getPriority());
        System.out.println("t2 thread priority:"+t2.getPriority());

        System.out.println("t1 Max priority :"+ t1.MAX_PRIORITY);
        System.out.println("t1 Min priority :"+ t1.MIN_PRIORITY);
        System.out.println("t1 Normal priority :"+ t1.NORM_PRIORITY);
        
        t1.setPriority(4);
        t2.setPriority(7);

        System.out.println("Name of thread :"+t1.getName());
        System.out.println("Name of thread :"+t2.getName());

        t1.setName("Mohan");
        t2.setName("Mahesh");

        System.out.println("Name of thread :"+t1.getName());
        System.out.println("Name of thread :"+t2.getName());

        System.out.println("t1 ID:"+t1.getId());
        System.out.println("t2 ID:"+t2.getId());

        System.out.println("State t1:"+t1.getState());
        System.out.println("State t2:"+t2.getState());
       
    }
	

}
