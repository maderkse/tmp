class SleepMessages implements Runnable
 { 
    public static void main(String args[])
 { 
	 Thread t1 = new Thread(new SleepMessages());
	 t1.start();
	 t1.interrupt();
 }
	public void run()
	{ 
     String importantInfo[] = { "Mares eat oats"
	                          , "Does eat oats"
							  , "Little lambs eat ivy"
							  , "A kid will eat ivy too" }; 
							  
	 for (int i = 0; i < importantInfo.length; i++)
     { //Pause for 4 seconds 
	 try{
	    Thread.sleep(4000);
		} catch (InterruptedException ie) {
			System.out.println("Thread is interrupted!");
		}
		//Print a message 
		System.out.println(importantInfo[i]); 
	 } 
   } 
}  
