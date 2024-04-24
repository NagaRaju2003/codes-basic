import java.util.*;
public class multiplication
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        int n4=sc.nextInt();
        int a[][]=new int[n1][n2];
        int b[][]=new int[n3][n4];
        for(int i=0;i<n1;i++)
        {
            for(int j=0;j<n2;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n3;i++)
        {
            for(int j=0;j<n4;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }
        if(n3!=n2)
        {
            System.out.println("multiplication not possible");
        }
        else
        {
            int res[][]=new int[n1][n4];
            for(int i=0;i<n1;i++)
            {
                for(int j=0;j<n4;j++)
                {
                    for(int k=0;k<n3;k++)
                    {
                        res[i][j]=res[i][j]+a[i][k]*b[k][j];
                    }
                }
            }
            System.out.println("multiplication iss");
            for(int i=0;i<n1;i++)
            {
                for(int j=0;j<n4;j++)
                {
                    System.out.print(res[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}

