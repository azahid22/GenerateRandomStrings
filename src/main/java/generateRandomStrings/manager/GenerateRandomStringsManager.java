package generateRandomStrings.manager;


import generateRandomStrings.bl.RandomStringGenerator;
import generateRandomStrings.exceps.InvalidInfoException;
import generateRandomStrings.utils.CommonUtilities;

import java.io.IOException;

public class GenerateRandomStringsManager {

    public static void main(String[] args) {
        try {
            int x = CommonUtilities.getInputFromUser();
            boolean validValueProvided = CommonUtilities.validateValueOfX(x);
            if(!validValueProvided){
                return;
            }
            RandomStringGenerator randomStringGenerator = new RandomStringGenerator();
            randomStringGenerator.generateStringsAndWriteIntoFile(x);

        } catch (InvalidInfoException invalidInfoException) {
            System.out.println("Invalid Information Provided:[" + invalidInfoException.getMessage() + "]");
        } catch (IOException ioException) {
            System.out.println("Unable to create/write to file:[" + ioException.getMessage() + "]");
        }
    }
}
