
public class ThreadEx2 implements Runnable {
		private String name=null;
		public ThreadEx2 (String n)
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
	    ThreadEx2 t1=new ThreadEx2("Tejaswi");
	    ThreadEx2 t2=new ThreadEx2("Shraddha");
	  // t1.start();
	   // t2.run();
	    Thread d1=new Thread(t1);
	    Thread d2=new Thread(t2);
	    d1.start();
	    d2.start();
	    for(int i=0;i<5;i++)
	    	System.out.println(i +"I am Main");
		}
	}


