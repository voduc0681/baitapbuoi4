import java.util.Scanner;
public class Calculator {
    public int calculateSum() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter numbers to sum, and type 'n' to stop:");
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("n")) {
                break;
            }
            try {
                int number = Integer.parseInt(input);
                sum += number;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer or 'n' to stop.");
            }
        }
        return sum;
    }

    public int calculateSumOfProduct(int n) {
        int totalSum = 0;
        StringBuilder expression = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            int product = 1;
            for (int j = 1; j <= i; j++) {
                product *= j;
            }
            totalSum += product;

            if (i == 1) {
                expression.append("1");
            } else {
                expression.append(" + 1");
                for (int j = 2; j <= i; j++) {
                    expression.append("*").append(j);
                }
            }
        }

        System.out.println("Expression: " + expression.toString());
        return totalSum;
    }


    public void printPrimeFactors(int n) {
        System.out.print("Prime factors of " + n + " are: ");
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }
        System.out.println();
    }
}
