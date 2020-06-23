package interfaces;

public class Bird implements Singable{

    private String name;

    public Bird(String name) {
        this.name = name;
    }

    public void sing(String songTitle){
        System.out.println("Jestem ptakiem"  + name + ", śpiwam: " + songTitle + ". Tirurei");
    }

}
