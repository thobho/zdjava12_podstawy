package exercises;

import java.util.ArrayList;

public class Sequence {



    private static int[] createSequence(int start, int diff, int end){

        //start,diff,end ==> 10,2,20 => 10,12,14,16,18,20
        //start,diff,end ==> 10,2,21 => 10,12,14,16,18,20
        //start,diff,end ==> 10,2,22 => 10,12,14,16,18,20,22

        //start,diff,end ==> 11,7,30 => 11,18,25
        return null;
    }

    //można napisać drugą wersję createSequence i użyć ArrayList

    static ArrayList<Integer> createSeaqunceList(int start, int diff, int end){
        ArrayList<Integer> arrayList = new ArrayList<>();

        int actualElement = start;

        while (actualElement < end){
            arrayList.add(actualElement);
            actualElement += diff;
        }

        return arrayList;

    }

    //1,3,5,7,9 => czy jest arytmetyczny, (diff = 2) => true


    static boolean isArithmeticSequence(int[] sequence){

        //tutaj sprawdzenie
        return false;
    }

}
