package exercises;

import java.math.BigInteger;

public class Power {


    // 4 -> 1 * 2 * 3 * 4 = 24
    // 5 -> 1 * 2 * 3 * 4 * 5 = 120
    // 6 -> 1 * 2 * 3 * 4 * 5 * 6 = 720


    // acc | i
    //  1  | 1 => 1 * 1 = 1 (wynik ląduje do accumulator, a i się inkrementuje w pętli)
    //  2  | 2 => 1 * 2 = 2
    //  2  | 3 => 2 * 3 = 6
    //  6  | 4 => 6 * 4 = 24
    // 24  | 5 => 120 ...itd...

    static int power(int n) {
        int accumulator = 1;

        for (int i = 1; i <= n; i++) {
            accumulator *= i;
        }

        return accumulator;
    }


    static BigInteger bigPower(BigInteger n) {
        //todo tutaj zaimplementuj silnię dla BigIntegera
        //1. Oparte o pętle for (argument n nie mioże być większy od zakresu int)
        int nAsInt = n.intValue();

        for (int i = 0; i < nAsInt; i++) {

        }


        //2. Opartę o pętlę while
        BigInteger anotherBigInt = new BigInteger("20");
        int compareResult = n.compareTo(anotherBigInt);

        //comapareResult < 0 to n jest mniejsze od anotherBigInt
        //comapareResult > 0 to n jest większe od anotherBigInt
        //compareResult == 0 to ne jest równe anotherBigInt

        return null;
    }


    //1. Napisz metode, która wyświatla napis który Big Integer z dwóch jest mniejszy

    static void minInteger(BigInteger a, BigInteger b) {

        int i = a.compareTo(b);

        if (i < 0) {
            System.out.println("a jest mniejsze");
        } else if (i > 0) {
            System.out.println("a jest większe");
        } else {
            System.out.println("liczby są równe");
        }


    }


    static BigInteger bigPowerWhile(BigInteger n) {

        BigInteger accumulator = new BigInteger("1");

        BigInteger i = new BigInteger("1");

        while (i.compareTo(n) <= 0) {

            accumulator = accumulator.multiply(i); //<- accumulator => accumulator * i

            i = i.add(new BigInteger("1")); //inkrementacja => i = i +1
        }

        return accumulator;
    }


    // 1! -> 1
    // 2! -> 1! * 2
    // 3! -> 2! * 3
    // 4! -> 3! * 4...

    static int powerRec(int n){
        if (n == 1){
            return 1;
        }
        return powerRec(n - 1) * n;
    }

    static int powerResShort(int n){
        return n == 1 ? 1 : powerResShort(n - 1) * n;
    }

    //todo silnia rekurencyjnie z BigInteger

    static void conditionalOperator(){

        int x = 2;

        String text = x < 10 ? "x jest mniejsze od 10" : "x jest większe lub równe od 10";

    }


    public static void main(String[] args) {

        int x = 10;

        int result = powerRec(x);

        System.out.println(result);


    }


}
