package interfaces;

import java.util.Objects;

public class Elephant {

    static String speciesName = "Słoń pospolity";

    private String name;
    private int weight;


    public Elephant(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String toString() {
        return "Elephant{" +
                "weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Elephant elephant = (Elephant) o;
        return weight == elephant.weight &&
                Objects.equals(name, elephant.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight);
    }

    public static void main(String[] args) {

        System.out.println(Elephant.speciesName);

        //1. Statyczne pole jest "wspólne" dla wszystkich obioektów klasy, a "nie-statyczne" należy do każdego obiekty.
        //2. Do pól statycznych nie powinniśmy się odowływać przez obiekty, tylko przez nazwę klasy.
        //3. ...

        System.out.println("   \\      ");




    }

}
