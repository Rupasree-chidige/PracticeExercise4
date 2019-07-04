package com.stackroute.pe4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindOccurrencesInString {
    public String findOccurrences(String inputCharSeq,String patt) {
        StringBuilder stringBuilder=new StringBuilder();
        /*
         * Returns: true if, and only if, a subsequence of the input sequence
         * matches this matcher's pattern
         */
        if(inputCharSeq!=null&&patt!=null) {
            Pattern pattern = Pattern.compile(patt);
            Matcher matcher = pattern.matcher(inputCharSeq);
            while (matcher.find()) {
                stringBuilder.append("Found at: " + matcher.start() + " - " + matcher.end()+"\n");
            }

            return stringBuilder.toString();
        }

            return  null;
    }

}
