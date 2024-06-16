import java.util.Scanner;
public class Main {
    public static void main(String[] args){ 
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        // calculateSum method
        System.out.println("Calculating sum of entered numbers:");
        int sumResult = calculator.calculateSum();
        System.out.println("Sum of entered numbers: " + sumResult);
        //  calculateSumOfProduct method
        System.out.print("Enter the value of n for calculateSumOfProduct: ");
        int n = scanner.nextInt();
        int sumOfProductResult = calculator.calculateSumOfProduct(n);
        System.out.println("Sum of products: " + sumOfProductResult);
        // printPrimeFactors method
        System.out.print("Enter a number to find its prime factors: ");
        int number = scanner.nextInt();
        calculator.printPrimeFactors(number);
    }
}
    