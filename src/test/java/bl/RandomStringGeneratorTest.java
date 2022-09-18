package bl;

import generateRandomStrings.bl.RandomStringGenerator;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class RandomStringGeneratorTest {

    @Test
    public void getAlphanumericStringTest() {
        String randomString = null;
        RandomStringGenerator randomStringGenerator = new RandomStringGenerator();
        randomString = randomStringGenerator.getAlphanumericString(100, 2);
        assertTrue(randomString.length() == 100);
        assertTrue(randomString.endsWith("2"));

        randomString = randomStringGenerator.getAlphanumericString(50, 200);
        assertTrue(randomString.length() == 50);
        assertTrue(randomString.endsWith("200"));

    }

    @Test
    public void generateStringsAndWriteIntoFile() throws IOException {
        RandomStringGenerator randomStringGenerator = new RandomStringGenerator();
        randomStringGenerator.generateStringsAndWriteIntoFile(200);

        Map<String, Integer> randomStringHashMap = new HashMap<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("RandomStrings.txt"))) {
            String line = bufferedReader.readLine();
            while (line != null) {
                assertEquals(null, randomStringHashMap.get("line"));
                randomStringHashMap.put(line,1);
                assertEquals(100, line.length());
                line = bufferedReader.readLine();
            }
        }
    }
}
