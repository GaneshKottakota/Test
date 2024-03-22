package in.mastanIt;


public class Demo1 implements Runnable{

	@Override
	public void run() {
         for(int i=1;i<=10;i++)	{
        	 System.out.println(i);
        	 
         }
	}
	public static void main(String[] args) {
		Demo1 demo = new Demo1();
		Thread t= new Thread(demo);
 t.start();
 t.setName("myThread");
 System.out.println(t.getName());
		
	}
}
         
      
        	 
         
        
	
	
	


