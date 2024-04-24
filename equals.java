import java.util.*;
public class equals {
    int x;
    int y;
    equals(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
    public void get()
    {
        System.out.println(x+"/"+y);
    }
    public boolean equal(int x2,int y2)
    {
        int k3=gcd(x,y);
        int k= gcd(x2,y2);
        int k1=x2/k;
        int k2=y2/k;
        int a1=x/k3;
        int a2=y/k3;
        if(k1==a1 && k2==a2)
        {
            return true;
        }
        else
        {
            return false;
        }

    }
    public int gcd(int a,int b)
    {
        if(b==0)
        {
            return a;
        }
        else
        {
            return gcd(b,a%b);
        }
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        equals obj=new equals(5,4);
        int x2=sc.nextInt();
        int y2=sc.nextInt();
        obj.get();
        System.out.println(obj.equal(x2,y2));


    }
}