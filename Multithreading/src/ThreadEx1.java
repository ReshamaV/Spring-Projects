
public class ThreadEx1 extends Thread {
	private String name=null;
	public ThreadEx1 (String n)
	{
		this.name=n;
	}
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(i+"#"+ name);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ThreadEx1 t1=new ThreadEx1("Tejaswi");
    ThreadEx1 t2=new ThreadEx1("Shraddha");
    t1.start();
    t2.start();
   // t2.run();
    for(int i=0;i<5;i++)
    	System.out.println(i +"I am Main");
	}

}
