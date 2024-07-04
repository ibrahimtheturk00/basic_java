import java.util.Random;
public class Main {
    public static void main(String[] args) {
            Random random = new Random();
            int day = random.nextInt(7) + 1;
            System.out.println(day);
            switch (day){
                case 1: System.out.println("It is Monday!");
                break;
                case 2: System.out.println("It is Tuesday!");
                break;
                case 3: System.out.println("It is Wednesday!");
                break;
                case 4: System.out.println("It is Thursday!");
                break;
                case 5: System.out.println("It is Friday!");
                break;
                case 6: System.out.println("It is Saturday!");
                break;
                case 7: System.out.println("It is Sunday!");
                break;
            }
        }
    }