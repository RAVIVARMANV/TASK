package train;

import java.util.Scanner;

public class fact {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        long factorial = calculateFactorial(number);
        System.out.println("Factorial of " + number + " is: " + factorial);
        scanner.close();
    }
    private static long calculateFactorial(int num) 
    {
        if (num < 0) {
            return -1; 
        }
        if (num == 0 || num == 1) {
            return 1; 
        }
        long result = 1;
        for (int i = 2; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}
