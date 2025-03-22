

class Demo extends Thread
{
    public void run()
    {
        
         for(int i = 1; i<100; i++)
         { }
         System.out.println("End of thread");
    }

}



class Multi4
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


/*
 
without using join method

in the output:
end of main thread 
end of thread

problem: main thread is ending before child thread
        parent thread should end at the last tat is after execution of all the child threads

        
*/
