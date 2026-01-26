import java.util.Scanner;

class SumOfDigit {

    public static void main(String [] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter The Number");
        int num=scanner.nextInt();
        System.out.println(sumOfDigit(num));
    }
    public static int sumOfDigit(int num)
    {
        int sum=0;
        while(num>0)
        {
            sum +=num%10;
            num /=10;
        }
        return sum;
    }
}
