package exercises;

public class ArraysPointers {


    public static void main(String[] args) {
        int[] testArray = {12,32,4,56,345,3234,434};

        funnyShowArray(testArray);
    }


    private static void funnyShowArray(int[] array){
        int start = 0;
        int end = array.length - 1;

        while (start <= end){
            System.out.println(array[start]);

            if(start != end){
                System.out.println(array[end]);
            }

            start++; // <-inkrementacja start = start + 1;
            end--;
        }

    }

    //
    //[10,20,1,3,100,300] => 30,4,400
    //  l  p








}
