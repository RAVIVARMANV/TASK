package train;

import java.util.Scanner;

public class check
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        boolean isSeniorCitizen = checkSeniorCitizen(age);
        if (isSeniorCitizen) {
            System.out.println("You are a senior citizen.");
        } else {
            System.out.println("You are not a senior citizen.");
        }
        scanner.close();
    }
    private static boolean checkSeniorCitizen(int age) {
        return age >= 60;
    }
}
