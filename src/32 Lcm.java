import java.util.Scanner;

class Lcm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Two Numbers");

        int first = scanner.nextInt();
        int second = scanner.nextInt();

        System.out.println(lcm(first, second));
    }

    public static int lcm(int first, int second) {

        int i = 1;
        while (true) {

            int fact = first * i;
            if (fact % second == 0) {
                return fact;
            }
               i++;

        }
    }


}
