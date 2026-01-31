class MinAndMaxArr {
    public static void main(String[] atgs) {
        int[] numArr = {11, 22, 33, 44, 55, 8, 1, 3};
        System.out.println("max value: " + max(numArr));
        System.out.println("Min value: " + min(numArr));

    }

    public static int max(int[] numArr) {
        int i = 0;
        int max = 0;
        while (i < numArr.length) {
            if (numArr[0] < numArr[i]) {
                max = numArr[i];
            }
            i++;
        }
        return max;
    }

    public static int min(int[] numArr) {

        int i = 0;
        int min = Integer.MAX_VALUE;
        while (i < numArr.length) {
            if (min > numArr[i]) {
                min = numArr[i];
            }
            i++;
        }
        return min;
    }


}
