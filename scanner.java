import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scan.nextLine();
        System.out.println("hello "+ name);
        System.out.println("How old are you?");
        int age = scan.nextInt();
        System.out.printf("You are %d years old.",age);
    }
}