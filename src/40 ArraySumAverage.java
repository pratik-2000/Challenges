class ArraySumAverage {
    public static void main(String[] args) {
        int[] numArray = ArrayUtility.inputArray();
        int i = 0;
        int sum = 0;
        System.out.println("length is: "+numArray.length);
        while (i < numArray.length) {

            sum += numArray[i];
            i++;
        }
        System.out.println("Sum is :"+sum);
        System.out.println("Average is :"+ average(sum,numArray.length));
    }

    public static int average(int sum, int length) {


        return sum / length;
    }

}
