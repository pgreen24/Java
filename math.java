import java.util.Scanner;
public class math {
    public static void main(String[] args) {
        double x = 3.24;
        double y = 10.0;
        double z = Math.max(x, y);
        System.out.println(z);
        double k = Math.abs(y);
        System.out.println(k);
        double l = Math.sqrt(y);
        System.out.println(l);
        double m = (double)Math.round(x);
        System.out.println(m);
        double n = Math.ceil(x);
        System.out.println(n);
        double o = Math.floor(x);
        System.out.println(o);


        Scanner jk = new Scanner(System.in);
        System.out.println("enter size x:");
        double a = jk.nextDouble();
        System.out.println("enter size y:");
        double b = jk.nextDouble();
        double c = Math.sqrt(a * b + a * b);
        System.out.println("the  hypotenuse is :" + c);

        jk.close();
    }
}
