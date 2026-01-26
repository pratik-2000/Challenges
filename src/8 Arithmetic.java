import java.util.Scanner;

class Arithmetic {

    public static void main(String[] args) {

        System.out.println("Enter Two Numbers");
        Scanner scanner = new Scanner(System.in);
        int num1=scanner.nextInt();
        int num2 =scanner.nextInt();
        int add= num1+num2;
        int sub=num1-num2;
        int mul=num1*num2;
        int divide=num1/num2;
        System.out.println("Addition is:"+ add);
        System.out.println("Subtraction is:"+ sub);
        System.out.println("Multiplication is:"+ mul);
        System.out.println("Division is:"+ divide);

    }


}
