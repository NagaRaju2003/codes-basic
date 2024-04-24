import java.util.*;
public class Palindrome {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String arr1[]=s.split(" ");
        int k=0;
        //System.out.println(arr1.length);
        for(int i=0;i<arr1.length;i++)
        {
            boolean b=pali(arr1[i]);
            if(b)
            {
                System.out.println(arr1[i]);
                k++;
            }

        }
        System.out.println(k);

    }
    public static boolean pali(String s)
    {
        String s2=s;
        StringBuilder sb=new StringBuilder(s);
        String s1=sb.reverse().toString();
        if(s2.equals(s1))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
