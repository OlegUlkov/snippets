public class Fibonacci {

    public static int fibonacci(int number) {
        if (number <= 0) {
            return 0;
        } else if (number == 1) {
            return 1;
        } else {
            return fibonacci(number - 2) + fibonacci(number - 1);
        }
    }

}
