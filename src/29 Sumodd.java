import java.util.Scanner;

class Sumodd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Number");
        int num = scanner.nextInt();
        System.out.println(oddSum(num));
    }

    public static int oddSum(int num) {
        int sum = 0;

        for (int i = 1; i <= num; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }


        return sum;
    }


}
