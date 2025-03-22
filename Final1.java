class Demo
{
    public int A;
    public final int B = 21;
    Demo()
    {
        A = 11;
        B = 21;
    }
    Demo(int i,int j)
    {
        A=i;
        B=j;
    }

}
class Final1 
{
    public static void main(String arg[])
    {
        Demo dobj = new Demo();

        System.out.println("Value of A"+dobj.A);
        System.out.println("Value of A"+dobj.A);

        dobj.A++;
        //dobj.B++;

        Demo dobj2 = new Demo(51,101);

    }
}




