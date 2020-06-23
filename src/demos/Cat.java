package demos;

public class Cat {

    private String name;


    public Cat(String name) {
        this.name = name;
    }

    public void printSweetName(){
        System.out.println(name + "uś");
    }

    public String getSweetName(){
        return this.name + "uś";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        Cat mruczek = new Cat("Mruczek");



    }

}
