import java.util.*;

public class Collections 
{
    public static void main(String Args[])
    {
        LinkedList <Integer> lobj = new LinkedList<Integer>();

        lobj.add(10);
        lobj.add(20);
        lobj.add(30);
        lobj.add(40);

        System.out.println(lobj);

        lobj.addFirst(5);

        System.out.println(lobj);

        boolean bret = true;
        bret = lobj.contains(30);
        if(lobj.contains(30))
        {
            System.out.println("contains 30");
 
        }

        else
        {
            System.out.println("not contains 30");

        }
        System.out.println("Index of 30 is : "+lobj.indexOf(30));
        Iterator iobj = lobj.iterator();

        while(iobj.hasNext())
        {
            System.out.println(iobj.next());
        }

    }
}
