public class sorting {
    public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }

    static int[] bubbleSort(int[] array) {
        int size = array.length;
        int j = 0;
        while (j < size - 1) {
//            System.out.println(j);
            for (int i = 0; i < size - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
            j++;
        }
        return array;
    }

    static int[] selectionSort(int[] arr) {
        int size = arr.length;
        for (int i = 0; i < size - 1; i++) {
            int smallestIndex = i;
            for (int j = i; j < size - 1; j++) {
                if (arr[smallestIndex] > arr[j + 1]) {
                    smallestIndex = j + 1;
                }
            }
            int temp = arr[i];
            arr[i] = arr[smallestIndex];
            arr[smallestIndex] = temp;
        }
        return arr;
    }

    static int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && temp < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            printArray(arr);
            System.out.println();
            arr[j + 1] = temp;
        }
        return arr;
    }

    static int partitionForQuickSort(int[] arr, int lowerBound, int upperBound) {
        int pivot = arr[lowerBound];
        int start = lowerBound;
        int end = upperBound;
        while (start < end) {
            while (arr[start] <= pivot) {
                start++;
            }
            while (arr[end] > pivot) {
                end--;
            }
            if (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
        }
        int temp = arr[lowerBound];
        arr[lowerBound] = arr[end];
        arr[end] = temp;
        return end;
    }

    static int[] quickSort(int[] arr, int lowerBound, int upperBound) {
        if (lowerBound < upperBound) {
            int lock = partitionForQuickSort(arr, lowerBound, upperBound);
            quickSort(arr, lowerBound, lock - 1);
            quickSort(arr, lock + 1, upperBound);
        }
        return arr;
    }


    public static void main(String[] args) {
        int[] arr = {7, 8, 3, 6, 0, 5, 1, 2};
//        printArray(bubbleSort(arr));
        printArray(insertionSort(arr));
//        printArray(selectionSort(arr));
//        printArray(quickSort(arr, 0, arr.length - 1));
    }
}
