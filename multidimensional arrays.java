public class Main {
    public static void main(String[] args) {
        Integer[][] numbers = new Integer[2][2];
        numbers[0][0] = 1;
        numbers[0][1] = 2;
        numbers[1][0] = 3;
        numbers[1][1] = 4;

        for(int i = 0; i < numbers.length; i++){
            System.out.println();
            for (int j = 0; j < numbers[i].length; j++){
                System.out.print(" "+numbers[i][j]);
            }
        }

        }
    }
