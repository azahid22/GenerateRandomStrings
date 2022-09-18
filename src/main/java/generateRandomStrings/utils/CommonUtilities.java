package generateRandomStrings.utils;


import generateRandomStrings.exceps.InvalidInfoException;

import java.util.Scanner;

public class CommonUtilities {

    public static int getInputFromUser() throws InvalidInfoException {
        try {
            System.out.println(" Please enter the Value for X: ");
            Scanner scanner = new Scanner(System.in);
            return scanner.nextInt();
        } catch (Exception ex) {
            throw new InvalidInfoException("Please enter a valid integer value for X ");
        }
    }

    public static boolean validateValueOfX(int x) {
        if (x < 1 || x > 229) {
            System.out.println("Provided value of X does not lies between 1 to 229");
            return false;
        }
        return true;
    }

}
