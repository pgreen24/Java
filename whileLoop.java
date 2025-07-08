import java.util.Scanner;

public class whileLoop {

    public static void main(String[] args) {
        Scanner jk = new Scanner(System.in);

        String name;
        for(name = ""; name.isEmpty(); name = jk.nextLine()) {
            System.out.println("enter your name: ");
        }

        System.out.println("hello " + name);
    }
}
