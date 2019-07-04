package com.stackroute.pe4;

import java.util.*;
import java.util.stream.Collectors;

public class FrequencyOfOccurences {
    public int countChars(String input,char stringchar){
        int count=0;
        if(input!=null&& (!input.isEmpty())) {

            List<Character> characterList = input.chars()    // IntStream
                    .mapToObj(e -> (char) e) // Stream<Character>
                    .collect(Collectors.toList());
            Iterator<Character> it = characterList.iterator();
            while (it.hasNext()) {
              if(it.next().equals(stringchar))
              {
                  count++;
              }
            }

        }
        return count;
    }

}
