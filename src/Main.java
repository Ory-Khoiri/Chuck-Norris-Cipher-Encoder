import java.util.Scanner;

public class Main {

    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Input string:");
        String stringInput = scanner.nextLine(); // input string
        System.out.print("The result:");
        binary_conversion(stringInput);


    }

    static void binary_conversion(String stringInput) {
        for (int i = 0; i < stringInput.length(); i++) {
            char character = stringInput.charAt(i);
            int ascii = (int) character; // convert character to ascii standard encoding
            String binary = Integer.toBinaryString(ascii); // convert ascii string into binary
            System.out.printf("%n%c = %07d",character, Integer.parseInt(binary));
            // format the binary string to contain 7 bits information


        }
    }
}
