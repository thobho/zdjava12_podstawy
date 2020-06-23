package interfaces;

public class Human implements Singable {


    private String name;

    public Human(String name) {
        this.name = name;
    }

    public void sing(String songTitle) {
        System.out.println("Nazwyma się" + name + ", śpiewam: " + songTitle);
    }

}
