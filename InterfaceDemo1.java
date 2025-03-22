// characteristics of interface are by deafult public static and final
// all methods of interface are by deafult public and abstarct
interface Circle
{
    float PI = 3.14f;

    public float Area(float radius);
    public float Circumference(float Radius);

}

class PPA implements Circle
{
    public float Area(float Radius)
    {
        return PI*Radius*Radius;
    }

    public float Circumference(float Radius)
    {
        return 2*PI*Radius;
    }
}


class InterfaceDemo1
 {
    public static void main (String args[])
    {
        PPA pobj = new PPA();

        System.out.println("Value of pi is: " + Circle.PI);  //char are static and public

         //Circle.PI = 6.15 characteristics of interface are final
        float fRet =0.0f;

        fRet = pobj.Area(10.7f);
        System.out.println("Area is : "+fRet);

        fRet = pobj.Circumference(10.7f);
        System.out.println("Circumference is : "+fRet);


    }
    
}
 
