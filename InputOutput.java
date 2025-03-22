import java.util.*;

public class InputOutput 
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enteer first no: ");
        int No1 = sobj.nextInt();

        System.out.println("Enteer second no: ");
        int No2 = sobj.nextInt();

        int Ans = 0;
        Ans = No1+ No2;

        System.out.println("Addition is: " +Ans);




    }
    
}
