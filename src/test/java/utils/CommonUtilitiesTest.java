package utils;

import generateRandomStrings.utils.CommonUtilities;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CommonUtilitiesTest {

    @Test
    public void validateValueOfXTest(){
        assertTrue(CommonUtilities.validateValueOfX(1));
        assertTrue(CommonUtilities.validateValueOfX(229));
        assertTrue(CommonUtilities.validateValueOfX(100));

        assertFalse(CommonUtilities.validateValueOfX(0));
        assertFalse(CommonUtilities.validateValueOfX(230));
        assertFalse(CommonUtilities.validateValueOfX(500));
    }
}
