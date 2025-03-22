
class Base
{
    public void fun() //1000
    { System.out.println("Inside base fun");}
    public void gun() //2000
    { System.out.println("Inside base gun");}
    public void sun() //3000
    { System.out.println("Inside base sun");}
    public void run() //4000
    { System.out.println("Inside base run");}

}

class Derived extends Base
{
    public void fun()//5000
    {System.out.println("Inside derived fun");}
    public void sun() //6000
    {System.out.println("Inside derived sun");}
    public void run(int A) //7000
    {System.out.println("Inside derived run");}
    public void mun() //8000
    {System.out.println("Inside derived mun");}

}


class Overriding
{
    public static void main (String arg[])
    {
        Base bobj = new Derived();
        bobj.fun(); //derrived gun
        bobj.gun(); //base gun
        bobj.sun(); // derived sun
        bobj.run(); //base run
        //bobj.run(11);  base doesnt have this method 
        //bobj.mun();   base doesnt have this method
        

    }
}
