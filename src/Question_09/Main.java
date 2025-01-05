package Question_09;


/**
 * Write a java program that performs the following task :
 * # Create an array of primitive  data type (e.g , int , double , char ).
 * # Use wrapper class (Integer , Double , Character) to convert
 * the primitive data type into their respective wrapper object
 */
public class Main {
    public static void main(String[] args) {

        int[] intArray = {1, 2, 3, 4, 5, 6};
        double[] doublesArray = {12.33, 45.66, 125.67};
        char[] charsArray = {'A', 'B', 'C'};

        Integer[] wrapperInt = new Integer[intArray.length];
        Double[] wrapperDouble = new Double[doublesArray.length];
        Character[] wrapperChar = new Character[charsArray.length];

        for (int i = 0; i < intArray.length; i++) {
            wrapperInt[i] = Integer.valueOf(intArray[i]);
        }

        for (int i = 0; i < doublesArray.length; i++) {
            wrapperDouble[i] = Double.valueOf(doublesArray[i]);
        }

        for (int i = 0; i < charsArray.length; i++) {
            wrapperChar[i] = Character.valueOf(charsArray[i]);
        }

        // Step 4: Print the original primitive arrays and converted wrapper objects
        System.out.println("Original int array:");
        for (int value : intArray) {
            System.out.print(value + " ");
        }
        System.out.println("\nConverted to Integer wrapper objects:");
        for (Integer value : wrapperInt) {
            System.out.print(value + " ");
        }

        System.out.println("\n\nOriginal double array:");
        for (double value : doublesArray) {
            System.out.print(value + " ");
        }
        System.out.println("\nConverted to Double wrapper objects:");
        for (Double value : wrapperDouble) {
            System.out.print(value + " ");
        }

        System.out.println("\n\nOriginal char array:");
        for (char value : charsArray) {
            System.out.print(value + " ");
        }
        System.out.println("\nConverted to Character wrapper objects:");
        for (Character value : wrapperChar) {
            System.out.print(value + " ");
        }
    }
}
