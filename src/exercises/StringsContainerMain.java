package exercises;

public class StringsContainerMain {


    public static void main(String[] args) {

        String[] testData = {"Ala", "ma", "kota"};

        StringsContainer poem = new StringsContainer(testData);

        poem.set("nie ma", 3);

        poem.add("A kot ma alę");

        poem.remove(2);

        poem.bubbleSort();

        System.out.println(poem);

    }

    int[] addNewIntToArray(int newInt, int[] array) {
        int[] resultArray = new int[array.length + 1];

        for (int i = 0; i < array.length; i++) {
            resultArray[i] = array[i];
        }

        resultArray[array.length] = newInt;

        return resultArray;

    }




















}
