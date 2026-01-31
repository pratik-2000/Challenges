class CheckSortedArray {
    public static void main(String[] args) {
        int[] numArray = {10,9,8,7,6,5,4,3,2,1};
        System.out.println("Increasing :- " + isIncreasing(numArray));
        System.out.println("Increasing :- " + isDecreasing(numArray));


    }

    public static boolean isIncreasing(int[] numArray) {
        int i = 1;
        while (i < numArray.length) {
            if (numArray[i] <= numArray[i-1]) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean isDecreasing(int[] numsArray) {

        int i = 1;
        while (i < numsArray.length) {
            if (numsArray[i] >= numsArray[i-1]) {
                return false;
            }
            i++;
        }
        return true;
    }
}
