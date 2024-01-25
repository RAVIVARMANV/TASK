package train;

import java.util.Scanner;

public class countnumber {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        int digitCount = countDigits(number);
        System.out.println("Number of digits in " + number + " is: " + digitCount);
        scanner.close();
    }
    private static int countDigits(int num) 
    {
        String numString = Integer.toString(num);
        return numString.length();
    }
}
