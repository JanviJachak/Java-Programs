 import Marvellous.Maths;
 import Marvellous.Infosystem.Arithmetic;
 
 class PackageDemo 
 {

    public static void main(String args[])
    {
        Maths mobj = new Maths();
        Arithmetic aobj = new Arithmetic();

        int iRet =0;

        iRet= mobj.Additon(10,11);

        System.out.println("Addition is: " +iRet);

        iRet= mobj.Substraction(10,11);

        System.out.println("Substraction is: " +iRet);

    }
    
}
