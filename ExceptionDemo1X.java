import java.util.*;

public class ExceptionDemo1X 
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the first no : ");
        int iNo1 = sobj.nextInt();

        System.out.println("Enter the second no : ");
        int iNo2 = sobj.nextInt();

        int iAns =0;

        try
        {
            System.out.println("Inside try block");
            iAns = iNo1/iNo2;
        }

        catch(ArithmeticException obj)
        {
            System.out.println("Inside catch block"+obj);
        }
        catch(ArrayIndexOutOfBoundsException obj)
        {
            System.out.println("Array index out of bound exception"+obj);
        }
        catch(Exception obj)
        {
            System.out.println("Inside generic catchbox"+obj);
        }

        finally
        {
            System.out.println("Inside finally block");
        }

        System.out.println("Division is : "+iAns);

    }
    
}

