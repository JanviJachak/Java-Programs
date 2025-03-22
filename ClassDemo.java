

class Marvellous
{
    public int i;
    public int j;

    public Marvellous()
    {
        System.out.println("Inside default constructor");
        this.i=0;
        this.j=0;
    }

    public Marvellous(int a,int b)
    {
        System.out.println("inside parametrized constructor");
        this.i=a;
        this.j=b;
    }

    public void fun()
    {
        System.out.println("Inside fun method");
    }
}
 
 class ClassDemo
{

    public static void  main (String arg[])
    {
        System.out.println("Inside Main");

        Marvellous mobj1 = new Marvellous();  //default constructor
        Marvellous mobj2 = new Marvellous(11,21); //parametrized

        System.out.println(mobj2.i); //11
        System.out.println(mobj2.j); //21

        mobj1.fun();

    }
    
}
