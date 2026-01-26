import java.util.Scanner;

class Gcd {

    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two number");
        int first=sc.nextInt();
        int second=sc.nextInt();
        System.out.println(gcd(first,second));
    }

    public static int gcd(int first,int second)
    {
        int gcd=1;
        int i=1;

        int least=least(first,second);
        while (i<=least)

        {
            if (first%i==0 && second%i==0)
            {
                gcd=i;
            }
            i++;
        }
        return gcd;
    }
    public static int least(int first,int second)
    {
        if (first>second)
        {
            return second;
        }
        else{
            return first;
        }
    }
}
