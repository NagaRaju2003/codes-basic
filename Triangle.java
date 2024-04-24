import java.util.*;
public class Triangle {
    int a;
    int b;
    int c;

    Triangle() {
        a = 3;
        b = 4;
        c = 5;
        int k = (a + b + c) / 2;
        double l1 = Math.sqrt(k * (k - a) * (k - b) * (k - c));
        System.out.println(l1);
        int p1 = a + b + c;
        System.out.println(p1);

    }

    public static void main(String[] args) {
        Triangle obj = new Triangle();

    }
}
