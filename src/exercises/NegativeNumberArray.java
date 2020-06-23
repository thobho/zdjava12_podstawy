package exercises;

import demos.Arrays;

import java.util.ArrayList;

public class NegativeNumberArray {





    //zwróć liczby ujemne z zadanej array listy
    static ArrayList<Integer> getNegatives(ArrayList<Integer> array){


        for (int i = 0; i < array.size(); i++) {

        }


        return null;
    }


    public static void main(String[] args) {


        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(19);
        arrayList.add(324);
        arrayList.add(423);
        arrayList.add(543);

        Integer integer = arrayList.get(0);

        System.out.println(integer);
        System.out.println(arrayList);

        boolean empty = arrayList.isEmpty();

        Integer remove = arrayList.remove(1);
        System.out.println(arrayList);


        arrayList.set(2, 1000000);
        System.out.println(arrayList);



    }














}
