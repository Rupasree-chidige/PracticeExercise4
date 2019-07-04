package com.stackroute.pe4;

import java.util.regex.Pattern;

public class FindHarry {

    public  boolean checkForHarry(String input){
        boolean result = false;
        if(input!=null) {

            result = Pattern.matches("^.*\\b(harry|Harry)\\b.*$", input);

        }
        return result;
    }
}
