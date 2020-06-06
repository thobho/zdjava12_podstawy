package exercises;

import java.util.Scanner;

public class JetBrainsSum {

    //Write a program that reads a sequence of integer numbers in a loop and adds up all numbers.
    // If a new number is equal to 0, the program must stop the loop and output the accumulated sum.
    // When the sum is equal or exceeded 1000 (the barrier), the program should also stop and output the value equal to sum - 1000.
    //Note, the input can contain extra numbers. Just ignore them.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int inputFromUser = 0;

        int sum = 0;
        while (true){

            inputFromUser = scanner.nextInt();

            if(inputFromUser == 0){
                System.out.println(sum);
                break;
            }

            sum+=inputFromUser;

            if(sum >= 1000){
                System.out.println(sum - 1000);
                break;
            }



        }



    }

}
