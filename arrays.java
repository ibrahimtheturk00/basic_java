import java.util.Random;
public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[5];
            for (int i = 0; i < numbers.length; i++){
                Random random = new Random();
                int a = random.nextInt(10) + 1;
                numbers[i] = a;
            }
            for (int i = 0; i < numbers.length; i++){
                System.out.println(numbers[i]);
            }
        }
    }