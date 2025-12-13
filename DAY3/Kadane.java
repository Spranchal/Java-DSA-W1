package DAY3;

public class Kadane {
    public static void main(String[] args) {
        int[] arr = {-2, -3, -1, -5};

        if(arr == null || arr.length == 0) System.out.println(0);

        if(arr.length == 1) System.out.println(arr[0]);
        int currentSum = 0;
        int maxSum = arr[0];

        for(int i = 0; i < arr.length; i++) {
            currentSum += arr[i];
            maxSum = Math.max(maxSum, currentSum);

            if(currentSum < 0) {
                currentSum = 0;
            }
        }

        System.out.println(maxSum);
    }
}
