
public class GroupThread extends Thread {
	GroupThread(String ab, ThreadGroup ac)
    {
        super(ac, ab);
        start();
    }
    public void run()
    {

        for (int i = 0; i <= 4; i++)
        {
            try
            {
                Thread.sleep(10);
            }
            catch (InterruptedException ex)
            {
                System.out.println("Exception occured");
            }
            System.out.println(Thread.currentThread().getName()+ ": Information Technology");
        }
    }

 public static void main(String arg[])
    {
        // creating the thread group
        ThreadGroup m1 = new ThreadGroup("parent thread group");
        ThreadGroup m2 = new ThreadGroup(m1, "child");

        GroupThread t1 = new GroupThread("Meera", m1);
        System.out.println("Meera one");
        GroupThread t2 = new GroupThread("Nikhil", m1);
        System.out.println("Nikhil two");

        m1.checkAccess();
        System.out.println(m1.getName() + " has access");
        m2.checkAccess();
        System.out.println(m2.getName() + " has access");
       
       // checking the number of active thread
        System.out.println("number of active thread: "+ m1.activeCount());
        
        // checking the number of active thread
        System.out.println("number of active Froup: "+ m1.activeGroupCount());
        System.out.println(m1.getParent());
        System.out.println("Max priority"+m1.getMaxPriority());
        System.out.println("ParentThreadGroup for " + m1.getName() + " is " + m1.getParent().getName());
        System.out.println("ParentThreadGroup for " + m2.getName() + " is " + m2.getParent().getName());
        

    }
}
	
		