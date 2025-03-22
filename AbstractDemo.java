
abstract class Demo
{
    public int A;
    public int B;

    public Demo()
    {
        System.out.println("Inside constructor");
        this.A = 0;
        this.B = 0;
    }

    abstract void fun();
    //in cpp - virtual void fun() = 0;

    void gun()
    {
        System.out.println("Inside Gun");
    }

}
class AbstractDemo 
{
    public static void main( String args[])
    {
        //Demo obj = new Demo(); Cannot instantiate the type Demo bc its abstract
    }
    
}
