import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = Scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = Scanner.nextInt();
        System.out.print("Enter third number: ");
        int num3 = Scanner.nextInt();

        int largest = num1;
        if (num2 > largest) largest = num2;
        if (num3 > largest) largest = num3;

        System.out.println("The largest number is: " + largest);
    }
}


