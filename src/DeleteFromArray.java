import java.util.Scanner;

class DeleteFromArray {
    public static void main(String []args)
    {   Scanner scanner=new Scanner(System.in);
        int []newArray=ArrayUtility.inputArray();
        System.out.println("Enter the Number you Want to delete");
        int number=scanner.nextInt();
        deleteValue(newArray,number);


    }
    public static void deleteValue(int []array,int num)
    {
        int ocr=NumberOfOccurrences.noOccurrences(num,array);
        int size=array.length-ocr;
        int[]newArray= new int [size];

        int i=0,j=0;
        while(i<array.length)
        {
            if(array[i]!=num)
            {
                newArray[j]=array[i];
                j++;
            }
            i++;
        }
        ArrayUtility.displayArray(newArray);
    }


}
