import java.util.Scanner;

class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Number");
        int num = scanner.nextInt();

        System.out.println("Factotial is:- " + factorial(num));

    }

    public static int factorial(int num) {
        int fact = 1;
        for (int i = 2; i <= num; i++) {
            fact *= i;
        }

        return fact;
    }

}
