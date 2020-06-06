package exercises;

public class StringsContainer {

    //stan, pola klasy

    private String[] data;

    //konstruktor
    public StringsContainer(String[] initialData) {
        this.data = initialData;
    }

    public void set(String newData, int index){
        //ustawia newData na jakimś indexie index

        data[index] = newData;

    }

    public void add(String newData){
        //dodawninie nowej wartości na końcu tablicy
        //1. Stworzyć nową (dłuższą tablicę)
        //2. Przepisać "stare" dane do "nowej" tablicy
        //3. Dodać newData na końcu
    }


    public void remove(int index){
        //usuwanie elemntu z tablicy na indexie i przepisanie "do nowej" tablicy
    }

    public void swap(int left, int right){
        //swapowanie (zamienianie elementów miejscami)
    }

    public void bubbleSort(){
        int czyAAAjestMniejszeOdBBB = "aaa".compareTo("bbb");
    }

    public String toString() {
        String result = "";
        for (int i = 0; i < data.length; i++) {
            result += "[" + data[i] + "]";
        }
        return result + "\n";
    }
}
