package exercises;

public class StringsContainerMain {


    public static void main(String[] args) {

        StringsContainer stringsContainer = new StringsContainer();

        stringsContainer.set("Test", 0);
    }


    static int[] removeFromArray(int[] oldArray, int index) {
        //1. Zrobienie nowej, "krótszej" tablicy.
        //2. Przepisanie tablicy
        //3. Zwrócenie tablicy
        if (index < 0 || index >= oldArray.length) {
            System.out.println("nieprawidłowy index");
            return new int[0];
        } else {

            int[] resultArray = new int[oldArray.length - 1];

            for (int i = 0; i < oldArray.length; i++) {

                if (i < index){
                    resultArray[i] = oldArray[i];
                } else if(i == index){
                  //nic nie robimy
                } else {
                    resultArray[i - 1] = oldArray[i];
                }
            }

            return resultArray;
        }
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
