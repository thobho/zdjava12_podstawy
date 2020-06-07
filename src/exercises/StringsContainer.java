package exercises;

public class StringsContainer {

    //stan, pola klasy
    private String[] data;

    //konstruktor
    public StringsContainer(String[] initialData) {
        //komentarz
        this.data = initialData;
    }

    public StringsContainer() {
        this.data = new String[0];
    }

    public void set(String newData, int index) {
        //ustawia newData na jakimś indexie index
        if (index < 0 || index >= this.data.length) {
            System.out.println("Nieprawidłowe dane");
            System.out.println("Nie można ustawić elementu na index: " + index);
            System.out.println("Tablica ma " + this.data.length + " elementów");
        } else {
            this.data[index] = newData;
        }

    }

    public void add(String newData) {
        //dodawninie nowej wartości na końcu tablicy
        //1. Stworzyć nową (dłuższą tablicę)
        //2. Przepisać "stare" dane do "nowej" tablicy
        //3. Dodać newData na końcu
    }


    public void remove(int index) {
        //usuwanie elemntu z tablicy na indexie i przepisanie "do nowej" tablicy

    }

    public void swap(int left, int right) {
        //swapowanie (zamienianie elementów miejscami)
    }

    public void bubbleSort() {
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
