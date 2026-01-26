import java.util.Scanner;

class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Number");
        int num = scanner.nextInt();
        printFibonacci(num);
    }
    public static void printFibonacci(int num) {
        if (num < 0) return;
        System.out.print("0 ");

        if (num == 0) return;

        System.out.print("1 ");

        int first = 0, second = 1;
        while (first + second <= num) {
            int third = first + second;
            System.out.print(third + " ");
            first = second;
            second = third;
        }

    }
}
