import java.util.Scanner;
public class StringMethod {
    public static void main(String[] args) {
        Scanner jk = new Scanner(System.in);
        System.out.println("enter the name: ");
        String name = jk.nextLine();
        String result = name.replace("l", "R");
        System.out.println(result);
    }
}
