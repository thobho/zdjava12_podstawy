package exercises;

public class ArraysPointers {


    public static void main(String[] args) {
        int[] testArray = {12, 32, 4, 56, 345, 3234};
        int[] emptyArray = {};
        int[] arrayWithOneElement = {1};
        int[] arrayWithTwoElement = {1,3};

        printPairSum(testArray);
    }


    private static void funnyShowArray(int[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            System.out.println(array[start]);

            if (start != end) {
                System.out.println(array[end]);
            }

            start++; // <-inkrementacja start = start + 1;
            end--;
        }

    }

    //Prawidłowo
    //[10,20,1,3,100,300] => 30,4,400
    //

    //... a jak zrobiłem
    //[10,20,1,3,100,300] => 30,21,4...
    //

    private static void printPairSum(int[] arr) {
        int left = 0;
        int right = 1;

        if (arr.length % 2 == 0 && arr.length > 1) {

            while (right < arr.length){

                System.out.println(arr[left] + arr[right]);
                left+=2;
                right+=2;
            }
        } else {
            System.out.println("Nieprawidłowa tablica");
        }


    }


}
