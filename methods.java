import java.util.Scanner;
static int add(int x, int y){
    int z = x + y;
    return z;
 }

public void main() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter first number");
    int x = scanner.nextInt();
    System.out.println("Enter second number");
    int y = scanner.nextInt();
    System.out.println("Your numbers' summation is: " + add(x,y));
}
