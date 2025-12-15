public class Recursion {
    static int fibonacci(int x) {
        if(x == 0 || x == 1) {
            return 1;
        }

        return fibonacci(x - 1) + fibonacci(x - 2);
    }

    static int factorial(int y) {
        if(y == 0) return 1;
        return y * factorial(y - 1);
    }
    public static void main(String[] args) {
        int x = 5;
        int y = 5;
        for(int i = 0; i <= x; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();
        for(int i = 0; i <= y; i++) {
            System.out.print(factorial(i) + " ");
        }

    }
}
