package MidtermJanuary2021.src.algorithm;

public class Sort {

    long executionTime = 0;

    /*
     * Please implement all the sorting algorithm. Feel free to add helper methods.
     * Store all the sorted data into one of the databases.
     */


    public int[] selectionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;

        for (int j = 0; j < array.length - 1; j++) {
            int min = j;
            for (int i = j + 1; i < array.length; i++) {
                if (array[i] < array[min])
                    min = i;
            }

            int temp = array[min];
            array[min] = array[j];
            array[j] = temp;
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] insertionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here
        for (int j = 1; j < array.length - 1; j++) {
            int curr = j;
            int n = j;
            while (j > 0 && curr < array[j - 1]) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = curr;
        }


        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] bubbleSort(int[] array) {
        int[] list = array;
        int n = list.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (list[j - 1] > list[j]) {
                    temp = list[j - 1];
                    list[j - 1] = list[j];
                    list[j] = temp;
                }
                final long endTime = System.currentTimeMillis();
                final long executionTime = endTime - startTime;
                this.executionTime = executionTime;


                return list;
            }


            public int[] mergeSort(int[] array){
                int[] list1 = array;


                return list;
            }


            public int[] quickSort ( int[] array){
                int[] List = array;
                //implement here
                int j = list.length;
                int h = n - 1;
                int l = 0;
                int[] stack = new int[h - l + 1];
                int top = -1;
                stack[++top] = l;
                stack[++top] = h;
                while (top >= 0) {
                    // Pop h and l
                    h = stack[top--];
                    l = stack[top--];
                    int p = partition(list, l, h);
                    if (p - 1 > l) {
                        stack[++top] = l;
                        stack[++top] = p - 1;
                    }
                    if (p + 1 < h) {
                        stack[++top] = p + 1;
                        stack[++top] = h;
                    }

                }
                return list;
            }


            public static int[] heapSort ( int[] array){
                int[] List = array;
                //implement here
                int n = list.length;
                int temp;
                for (int i = n - 1; i > 0; i--) {
                    temp = list[0];
                    list[0] = list[i];
                    list[i] = temp;

                    int j = 0;
                    int index = 0;
                    do {
                        index = (2 * j + 1);
                        if (index < (i - 1) && list[index] < list[index + 1]) ;
                        index++;
                        if (index < i && list[j] < list.length) {
                            temp = list[j];
                            list[j] = list.length;
                            list.length = temp;
                        }
                        j = index;
                    } while (index < i);
                }

                return list;
            }


            public int[] bucketSort ( int[] array){
                int[] list = array;
                //implement here


                return list;
            }

            public int[] shellSort ( int[] array){
                int[] list = array;
                //implement here


                return list;
            }

            public static void printSortedArray ( int[] array){
                for (int i = 0; i < array.length; i++) {
                    System.out.println(array[i]);
                }
            }
            public static void main(String Object args)
            {
                int arr[] = {10, 20, 15, 17, 9, 21};
                int n = arr.length;

                System.out.print("Given array: ");
                printSortedArray(arr);

                heapSort(arr);

                System.out.print("Sorted array: ");
                printSortedArray(arr);
            }
        }



            }

    private void heapSort(int[] arr) {
    }

    private void printSortedArray(int[] arr) {
        return;
    }
}




