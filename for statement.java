import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
            int row;
            int column;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter number of rows");
            row = scanner.nextInt();
            System.out.println("Enter number of columns");
            column = scanner.nextInt();
            System.out.println("Enter a symbol");
            String symbol = scanner.next();
            for (int i = 0; i < row; i++){
                System.out.println();
                for(int j = 0; j < column; j++){
                        System.out.print(symbol);
                }
            }
        }
    }
