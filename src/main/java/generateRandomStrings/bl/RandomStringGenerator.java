package generateRandomStrings.bl;

import java.io.FileWriter;
import java.io.IOException;

/**
 * This class is responsible for generating unique random numbers and save them into RandomStrings.txt file.
 */
public class RandomStringGenerator {
    private static final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
            + "0123456789"
            + "abcdefghijklmnopqrstuvxyz";

    /**
     * This method will produce random strings of size equal to sizeOfString.
     * Random StringIteration is the salt which we are adding to the random generated strings and it will ensure the uniqueness of strings.
     *
     * @param sizeOfString
     * @param randomStringIteration
     * @return
     */
    public String getAlphanumericString(final int sizeOfString, int randomStringIteration) {
        StringBuilder randomStringBuilder = new StringBuilder();

        for (int i = 0; i < sizeOfString; i++) {
            int index = (int) (ALPHA_NUMERIC_STRING.length() * Math.random());

            randomStringBuilder.append(ALPHA_NUMERIC_STRING.charAt(index));
        }
        randomStringBuilder.append(randomStringIteration);
        if (randomStringBuilder.length() > sizeOfString) {
            return randomStringBuilder.substring((randomStringBuilder.length() - sizeOfString));
        }
        return randomStringBuilder.toString();
    }


    /**
     * This method will call getAlphanumericString for X times and will save the generated string in file.
     *
     * @param x
     * @throws IOException
     */
    public void generateStringsAndWriteIntoFile(int x) throws IOException {
        String randomString;
        try (FileWriter writer =
                     new FileWriter("RandomStrings.txt")) {
            for (int i = 0; i < x; i++) {
                randomString = getAlphanumericString(100, i);
                writer.append(randomString);
                writer.append("\n");
            }
        }
    }
}
