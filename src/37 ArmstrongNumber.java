import java.util.Scanner;

class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scanner.nextInt();
        System.out.println(isArmstrong(num));

    }

    public static boolean isArmstrong(int num) {
        int digit = noOfDigits(num);
        int numCopy = num;
        int finalNum = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            num /= 10;
            finalNum += power(lastDigit, digit);
        }
        return finalNum == numCopy;

    }

    public static int power(int num, int power) {

        int result = 1;
        int i = 0;
        while (i < power) {
            result *= num;
            i++;
        }
        return result;
    }

    public static int noOfDigits(int num) {
        int digit = 0;
        while (num > 0) {
            digit++;
            num /= 10;

        }
        return digit;
    }

}
