

public class CommandLine1
{
    public static void main(String arg[])
    {
        System.out.println("Number of command line arguments are : "+arg.length);

        System.out.println("Command line arguments are : ");

        for(int i = 0; i< arg.length; i++)
        {
            System.out.println(arg[i]);
        }

    }
    
}

//javac CoomandLine.java
// java CommandLine 21 32 45 45
