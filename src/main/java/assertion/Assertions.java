package assertion;

import org.testng.Assert;

/**
 * This class uses methods for assertions from different test cases
 */

public class Assertions {

    public static String expectedErrorMessage;
    public static String actualErrorMessage;

    public static String expectedImagesPage;
    public static String actualPage;

    public void assert_IfThereIsErrorMessage() {
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage,"Error message is not appeared");
    }
    public void assert_IfThereIsRightPage() {
        Assert.assertEquals(actualPage, expectedImagesPage,"We are in the wrong page");
    }
}