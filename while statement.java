import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
            int start = 0;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Up to what you want to count?");
            int finish = scanner.nextInt();
            while (start < finish){
                start++;
                System.out.println(start);
            }
        }
    }
