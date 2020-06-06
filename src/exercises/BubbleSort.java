package exercises;

public class BubbleSort {

    //l = 6
    //cykl (i) = 0 => 5 <= (6 - i - 1)
    //cykl (i) = 1 => 4 <= (6 - i - 1)
    //cykl (i) = 2 => 3 ...
    //cykl (i) = 3 => 2
    //cykl (i) = 4 => 1
    //cykl (i) = 5 => 0


    public static void main(String[] args) {
        int[] test = {5, 4, 3, 2, 1, 6};


        bubbleSort(test);

        print(test);
    }

    private static void bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {

                int left = j;
                int right = j + 1;

                if (arr[left] > arr[right]) {
                    swap(arr, left, right);
                }
            }
        }
    }


    private static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("[" + arr[i] + "]");
        }
    }


    private static void swap(int[] arr, int indexLeft, int indexRight) {
        int leftValue = arr[indexLeft];
        int rightValue = arr[indexRight];
        arr[indexLeft] = rightValue;
        arr[indexRight] = leftValue;
    }

}
