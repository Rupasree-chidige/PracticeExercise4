package com.stackroute.pe4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringTranspose {

    public String transpose(String input)
    {
        List<String> words = Arrays.asList(input.split("\\s"));
        StringBuilder result=new StringBuilder();
        for (String item:words) {
            StringBuilder temp=new StringBuilder();
            for (int i = (item.length() - 1); i >= 0; i--) {

                temp= temp.append(item.charAt(i));

            }
            result.append(temp+" ");

        }
        return result.toString().trim();
    }
}
