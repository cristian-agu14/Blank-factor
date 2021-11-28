package com.test.automation.utils;

public class Exceptions extends AssertionError{
    public static final String ERROR_WITH_THE_TOKEN = "The Authentication TOKEN is not present";

    public Exceptions(String msg){
        super(msg);
    }
}
