package utils;

public class TestUtils {

    public static void sleep(long m) {

        try {
            Thread.sleep(m);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}