import java.util.Scanner;

class PrimeNumber {
    public static void main(String []args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter The Number");
        int num=scanner.nextInt();
        System.out.println(isPrime(num));

    }
        public static boolean isPrime(int num)
        {
            int i=2;
            while(i<num)
            {
                if (num%i==0)
                {
                     return false;
                }
                i++;
            }
            return true;

        }
}
