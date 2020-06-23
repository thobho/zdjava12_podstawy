package exercises;


/*
Przemek
Snail creeps up the vertical pole of height H feets. 
Per day it goes A feets up, and per night it goes B feets down. 
In which day the snail will reach the top of the pole? 
Input data format On the input the program receives non-negative integers H, A, B, where H > B and A > B. 
Every integer does not exceed 100.
*/


public class Snail {

    static int h = 100;
    static int a = 10;
    static int b = 5;

    public static void main(String[] args) {
        int dailySnailWay = a - b;
        int day = 0;
        int actualHeight = 0;
        while (actualHeight < h) {
            System.out.println("Po dniu numer: " + day + "| ślimak jest na wysokości: " + actualHeight);
            actualHeight += dailySnailWay;
            day++;
        }
    }

    private static int snailWay() {
        //todo testwoać czy to jest dobrze
        int h = 101;
        int a = 10;
        int b = 5;


        //ułiżyć działanie arytmetyczne do rozwiązania zadania.
        return 0;

    }


}
