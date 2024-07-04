import java.util.Scanner;
public class scanner {
    public static void main(String[] args){
        int x = 15;
        int y = -10;
        int z = Math.abs(y);
        System.out.println(z);

        z = Math.min(x,y);
        System.out.println(z);

        z = Math.max(x,y);
        System.out.println(z);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first side of triangle");
        float a = scanner.nextFloat();
        System.out.println("Enter second side of triangle");
        float b = scanner.nextFloat();
        float c = (float) Math.sqrt((Math.pow(a,2))+(Math.pow(b,2)));
        System.out.println("Hypotenuse of " + a + " and " + b + " is: " + Math.round(c));

    }
}