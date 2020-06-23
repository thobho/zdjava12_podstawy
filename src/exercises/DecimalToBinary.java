package exercises;

public class DecimalToBinary {

    public static void main(String[] args) {
        String binaryRepresentation = decimalToBinary(11);
        System.out.println(binaryRepresentation);
    }

    static String decimalToBinary(int number){
        if(number < 0){
            return "";
        }

        String binaryRepresentation = "";

        while (number != 0){
            int restOfDivide = number % 2;
            number = number / 2;
            binaryRepresentation = restOfDivide + binaryRepresentation; //powinniśmy użyć String Buildera
        }

        return binaryRepresentation;
    }

}
