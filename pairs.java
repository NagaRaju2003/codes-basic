import java.util.*;
public class pairs
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for(int i=10;i<=99;i++)
        {
            for(int j=10;j<=99;j++)
            {
                if(i+j==60 && i-j==14)
                {
                    System.out.println(i+" "+j);
                }
            }
        }

    }
}