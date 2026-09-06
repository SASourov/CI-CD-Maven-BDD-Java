package utils;

import java.util.Random;

public class TestData {

    public static final String NAME = "Test Name";
    public static final int RANDOM_NUMBER = new Random().nextInt(10000);

    public static final String EMAIL =
            "testname" + RANDOM_NUMBER + "@mail.com";
    public static final String URL = "https://www.automationexercise.com/";
}
