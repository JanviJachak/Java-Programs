

class Demo extends Thread
{
    public void run()
    {
         String name = Thread.currentThread().getName();
         System.out.println("Current thread is : "+Thread.currentThread().getName());

         for(int i = 1; i<100; i++)
         {
            System.out.println("Name of thread is : "+name+" with counter : "+i);
         }
    }

}



class Multi3 
{
    public static void main(String arg[])
    {
        System.out.println("Current thread is : "+Thread.currentThread().getName());

        Demo obj1 = new Demo();  //new state
        Demo obj2 = new Demo();  //new state

        obj1.setName("First");  //gives name to thread
        obj2.setName("Second");

        obj1.start();  //runnable
        obj2.start();   //runnable
           

        System.out.println("Thread goes to dead state"); //dead state

    }
    
}
