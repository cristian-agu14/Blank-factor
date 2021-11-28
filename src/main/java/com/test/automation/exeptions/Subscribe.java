package com.test.automation.exeptions;

public class Subscribe extends AssertionError{

    /**
     * Variable
     */
    private static final long serialVersionUID = 1L;

    public static final String ERROR_ON_TEST_ABOUT_ALTERNATIVES = "The subscription was not successful";

    public Subscribe(String message, Throwable testErrorException) {
        super(message, testErrorException);
    }

}
