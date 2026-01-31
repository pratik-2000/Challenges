import java.util.Scanner;

class NumberOfOccurrences {
    public static void main(String [] args)
    {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter The Number");

        int []numArr={12,31,11,23,45,66,11,31,12,12,11,45,31,45};
        int num= scanner.nextInt();

        System.out.println(noOccurrences(num,numArr));

    }

    public static int noOccurrences(int num ,int []numArr)
    {
        int i=0;
        int occurrenc=0;
        while(i<numArr.length)
        {
            if (numArr[i]==num){
                occurrenc++;
            }
            i++;
        }
        return occurrenc;
    }


}
