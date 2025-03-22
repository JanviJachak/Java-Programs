
class Arithmetic
{
    public int addition(int A, int B)
    {
        return A+B;
    }
    public int addition(int A,int B,int C)
    {
        return A+B+C;
    }
    public double addition(double A,double B)
    {
        return A+B;
    }
    public void addition(int A,double B)  //by changing seq of arguments if datatypes are diffrent
    {
        System.out.println("inside first addition");
    }
    
    public void addition(double A,int B) //by changing seq of arguments if datatypes are diffrent
    {
    {
        System.out.println("inside second addition");
    }
    
}



public class Overloading 
{
    public static void main(String arg[])
    {
        Arithmetic aobj = new Arithmetic();
        int iRet =0;
        double dRet =0.0;

        iRet =aobj.addition(10,11);
        System.out.println("Addition is :"+iRet);
        iRet =aobj.addition(10,11,21);
        System.out.println("Addition is :"+iRet);
        dRet =aobj.addition(10.8,11.7);
        System.out.println("Addition is :"+dRet);
        aobj.addition(11,90.99);
        aobj.addition(90.99,11);


    }
    
}
