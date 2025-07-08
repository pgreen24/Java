import java.util.Random;
public class RandomNumbers {
    public static void main(String[] args) {
            Random xy = new Random();
            int a = xy.nextInt(6) + 1;
            double b = xy.nextDouble();
            boolean c = xy.nextBoolean();
            System.out.println(a + "\n" + b + "\n" + c + "\n");
    }
}

