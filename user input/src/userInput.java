import java.util.Scanner;

public class userInput {
    public static void main(String[]args){
        Scanner a = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = a.nextLine();

        System.out.print("Enter your age: ");
        int age = a.nextInt();

        System.out.print("Enter your CGPA: ");
        float CGPA = a.nextFloat();

        System.out.print("are you student?(true or false):");
        boolean student = a.nextBoolean();


        System.out.println("hello " + name);
        System.out.println("your age is "+ age + " years old");
        System.out.println("your CGPA IS "+ CGPA);
        System.out.println("Student :" + student);
        if (student){
            System.out.println("lima you're enrolled as a student");
        }
        else {
            System.out.println("lima you're not enrolled ");
        }

        //another way
        int area;
        int width;
        float height;

        System.out.print("enter the width: ");
        width = a.nextInt();

        System.out.print("enter the height: ");
        height =a. nextFloat();

        area = (int)(width * height);
        System.out.print("the area is : " + area + " cm²");

        a.close();

    }
}
