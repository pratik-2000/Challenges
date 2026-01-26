import java.util.Scanner;

class Product {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Two Number");

        int num1 =scanner.nextInt();
        int num2=scanner.nextInt();

        int product=num1*num2;
        System.out.println("Product Of Two Number Is :" +product);
    }
}
