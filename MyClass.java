import java.util.*;
public class MyClass {
    int x;
    int y;
    MyClass(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
    public void get()
    {
        System.out.println(x+"/"+y);
    }
    int b=0;
    public void equal(int x2,int y2)
    {
        if(x<x2 && y<y2)
        {
            for(int i=1;i<Integer.MAX_VALUE;i++)
            {
                if(i*x==x2 && i*y==y2)
                {
                    System.out.println("idential");
                    b=1;
                    break;

                }
            }
            if(b==0)
            {
                System.out.println("Not identical");
            }
        }
        else if(x2<x && y2<y)
        {
            for(int i=1;i<Integer.MAX_VALUE;i++)
            {
                if(i*x2==x && i*y2==y)
                {
                    System.out.println("idential");
                    b=1;
                    break;
                }
            }
            if(b==0)
            {
                System.out.println("Not identical");
            }
        }
        else
        {
            System.out.println("nnot");
        }
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        MyClass obj=new MyClass(5,4);
        int x2=sc.nextInt();
        int y2=sc.nextInt();
        obj.get();
        obj.equal(x2,y2);


    }
}