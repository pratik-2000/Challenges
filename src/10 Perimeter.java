import java.util.Scanner;

class Perimeter {
    public static void main(String [] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter 4 sides");
        double a=scanner.nextDouble();
        double b=scanner.nextDouble();
        double c=scanner.nextDouble();
        double d=scanner.nextDouble();

        System.out.println("Perimeter is: "+a+b+c+d+"Cm");
    }
}
