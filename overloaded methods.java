public class Main {
    public static void main(String[] args) {
        int x = add(1,2);
        System.out.println(x);
        x = add(1,2,3);
        System.out.println(x);

        }

    static int add(int a, int b){
        System.out.println("Method One");
        int c = a + b;
        return c;
    }
    static int add(int a, int b, int c){
        System.out.println("Method Two");
        int d = a + b + c;
        return d;
    }
}
