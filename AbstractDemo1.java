

abstract class Demo
{
    public int A;
    public int B;

    public Demo()
    {
        System.out.println("Inside Demo constructor");
        this.A = 0;
        this.B = 0;
    }

    abstract void fun();
    //in cpp - virtual void fun() = 0;

    void gun()
    {
        System.out.println("Inside Gun of Demo");
    }

}

class Hello extends Demo
{
    public Hello()
    {
        System.out.println("Inside hello constructor");
    }

    public void fun()
    {
        System.out.println("Inside fun of Hello");
    }

}
class AbstractDemo1 
{
    public static void main( String args[])
    {
        Hello hobj = new Hello(); 

        hobj.fun();
        hobj.gun();
    }
    
}
