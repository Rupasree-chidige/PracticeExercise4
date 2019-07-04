package com.stackroute.pe4;

public class ReplaceCharInString {

    public String replaceChars(String input) {
        if (input != null && (!input.isEmpty())) {

            input = input.replace('d', 'f').replace('l', 't');
            return input;

        } else {
            return null;
        }


    }
}
