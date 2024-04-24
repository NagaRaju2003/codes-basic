import java.util.*;
abstract class shape
{
    int a;
    int b;
    abstract void printshape(int a,int b);

}
class triangle extends shape
{
    void printshape(int a,int b)
    {
        System.out.println(0.5*(a*b));
    }
}
class circle extends shape
{
    void printshape(int a,int b)
    {
        System.out.println(3.14*(a*a));
    }
}
class Rectangle extends shape
{
    void printshape(int a ,int b)
    {
        System.out.println(a*b);
    }
    public static void main(String args[])
    {
        Scanner scc=new Scanner(System.in);
        int a= scc.nextInt();
        int b= scc.nextInt();
        shape obj=new Rectangle();
        obj.printshape(a,b);
    }
}
