package DAY3;

public class Kadane {
    public static void main(String[] args) {
        int[] arr = {1,2,15,2,6,-10,-5};
        int currentSum = 0;
        int maxSum = arr[0];

        for(int i = 0; i < arr.length; i++) {
            currentSum += arr[i];
            if(currentSum < 0) {
                currentSum = 0;
                
                continue;
            }
            if(currentSum > maxSum) {
                maxSum = currentSum;
                System.out.println(currentSum);
            }
        }

        System.out.println(maxSum);
    }
}
