package interfaces;

public class Orchestra {

    public static void main(String[] args) {
        Singable janusz = new Human("Janusz");
        Singable bird = new Bird("Andrzej");

        Singable[] orchisraMembers = new Singable[2];

        orchisraMembers[0] = janusz;
        orchisraMembers[1] = bird;

        for (Singable member : orchisraMembers) {
            member.sing("Wlazł kotek na płotek");
        }


    }

}
