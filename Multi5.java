

class Demo extends Thread
{
    public void run()
    {
        
         for(int i = 1; i<100; i++)
         {
            try
            {
                System.out.println("Value of i is : "+i);
                Thread.sleep(1000);  //wait for 1000 ms
            }

            catch(Exception obj)
            {

            }

         }
    }

}



class Multi5
{
    public static void main(String arg[]) throws Exception
    {
        System.out.println("Current thread is : "+Thread.currentThread().getName());

        Demo obj1 = new Demo();  //new state
        obj1.start();  //runnable

        obj1.join();  //joprynt obj1 execute hot  nai toprynt wait

        System.out.println("End of main thread"); //dead state

    }
    
}
