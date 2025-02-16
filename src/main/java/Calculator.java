import java.util.UUID;

class Calculator {

    // Constructor
    Calculator(){
    }

    // Method to add two integers
    int add(int a , int b){
        return a + b;
    }

    // Method to subtract two integers
    int subtract(int a , int b){
        return a - b;
    }

    // Method to multiply two integers
    int multiply(int a , int b){
        return a * b;
    }

    // Method to divide two integers
    int divide(int a , int b){
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return a / b;
    }

    /*
    Returns the n'th number in the Fibonacci sequence
    Example below
    n = x
    1 = 1
    2 = 1
    3 = 2
    4 = 3
    5 = 5
    . . .
    */
    int fibonacciNumberFinder(int n){
        if (n <= 1) return n;
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }

    /*
    Returns the binary value of the given int number as a string
    Example: int a = 10 -> returns "1010"
    */
    String intToBinaryNumber(int number){
        return Integer.toBinaryString(number);
    }

    /*
    Creates a completely unique String identifier for a given string
    Each created ID must contain the string n in its unaltered form
    */
    String createUniqueID(String n){
        String uniquePart = UUID.randomUUID().toString().replace("-", "");
        return n + uniquePart;
    }

}
