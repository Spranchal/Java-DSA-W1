public class DSAPractice {
    public static void swap(int[] arr, int i, int j) {//SWAP
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void printArray(int[] arr, int n) {//PRINTING
        System.out.println("The sorted array is: ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void bubbleSort(int[] arr, int n) {//BUBBLE SORT
        for(int i = 0; i < n - 1; i++) {
            for(int j = 0; j < n - i - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    swap(arr, j, j+1);
                }
            }
        }
    }
    public static void selectionSort(int[] arr, int n) {//SELECTION SORT
        for(int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for(int j = i + 1; j < n; j++) {
                if(arr[j] < arr[minIdx]){
                    minIdx = j;
                }
            }
            swap(arr, i, minIdx);
        }
    }
    public static void insertionSort(int[] arr, int n) {//INSERTION SORT
        for(int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
    public static void merge(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for(int i = 0; i < n1; i++) L[i] = arr[l + i];
        for(int j = 0; j < n2; j++) R[j] = arr[m + 1 + j];
        int i = 0, j = 0, k = l;
        while(i < n1 && j < n2) {
            if(L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while(i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while(j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }

    }
    public static void mergeSort(int[] arr, int l, int r) {
        if(l < r)  {
            int m = l + (r - l) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr,m + 1, r);
            merge(arr, l, m, r);

        }

    }
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for(int j = low; j < high; j++) {
            if(arr[j] <= pivot) {
                i++;

                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }
    public static void quickSort(int[] arr, int low, int high) {
        if(low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
    public static void main(String[] args) {//MAIN
        int[] arr = {2,3,6,1,8,5,9,10,4};
        int n = 5;
        // bubbleSort(arr, n);
        // selectionSort(arr, n);
        // insertionSort(arr, n);
        // mergeSort(arr, 0, n - 1);
        // quickSort(arr, 0, n - 1);
        printArray(arr, n);
    
        
    }
}
