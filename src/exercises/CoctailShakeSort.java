package exercises;

public class CoctailShakeSort {

    static void cocktailSort(int array[]) {

        //zmienna, która mówi nam, czy w trakcie pętli głównej wystąpiło
        //jeżeli nie było zamiany (swap), to znaczy, że tablica jest posortowana
        boolean swapped = true;
        int start = 0;
        int end = array.length;

        while (swapped == true) {
            swapped = false;
            //pętla "bąbelka" idąca od początku do końca, wyciągająca największą wartość na koniec tablicy
            for (int i = start; i < end - 1; ++i) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }

            if (swapped == false){
                break; //jeśli przeszliśmy w poprzedniej pętali całą tablicę i nie było ani jednego "swapa", to tablica jest posortowana,
                //...i możemy przerwać pętlę
            }

            //resetujemy zmienną swapped
            swapped = false;

            // aktualizujemy zmienną "end". następna pętla sortowania będzie o jedną komórke tablicy "krótsza"
            end = end - 1;

            // analogiczna pętla przechodząc od "tyłu do przodu"
            for (int i = end - 1; i >= start; i--) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }

            //również aktualizujemy zmienną start, żeby sortować
            start = start + 1;
        }
    }

    static void printArray(int array[]) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {16,24,23,54,65,56,76};
        cocktailSort(array);
        printArray(array);
    }




}
