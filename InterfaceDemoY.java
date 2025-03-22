//one interface can inhertit anither interface

interface Demo
{
    void fun();

}

interface Hello extends Demo
{
    void gun();
}

class Marvellous implements Hello  //hello la implement krtoy so compulsory to give bidy to fun and gun both
{
    public void fun()
    {

    }
    public void gun()
    {

    }
}


public class InterfaceDemoY 
{
    public static void main (String args[])
    {}
}
