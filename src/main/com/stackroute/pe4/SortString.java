package com.stackroute.pe4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortString {

    public List<String> sortText(String input)
    {
        if (input != null && (!input.isEmpty())) {
            List<String> list = Arrays.asList(input.toLowerCase().split("\\s+"));
            Collections.sort(list);
            return list;
        }
        else{
            return null;
        }

    }
}
