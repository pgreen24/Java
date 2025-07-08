public class printf {
    public printf() {
    }

    public static void main(String[] args) {
        System.out.printf("%d the number is\n", 23543);
        boolean a = true;
        char b = '$';
        String d = "lima";
        int e = 453;
        double k = 32342.0;
        System.out.printf("%b\n", a);
        System.out.printf("%c\n", b);
        System.out.printf("%s\n", d);
        System.out.printf("%d\n", Integer.valueOf(e));
        System.out.printf("%f\n", k);
        System.out.printf("hi %10s\n", d);
        System.out.printf("you have this much money %.2f\n", k);
        System.out.printf("you have this much money %20f\n", k);
        System.out.printf("you have this much money %+f\n", k);
        System.out.printf("%020f\n", k);
        System.out.printf("you have this much money %,f\n", k);
    }
}

