import java.util.Scanner;

public class ArrayUtility {

    public static int[] inputArray()

    {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Size Of An Array");
        int size = scanner.nextInt();
        int nums[] = new int[size];
        int i = 0;
        while (i < size) {
            System.out.println("Enter the elements no" + (i + 1) + ": ");
            nums[i] = scanner.nextInt();
            i++;
        }
        return nums;
    }


}
