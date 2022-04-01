package org.kich.practice;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class InterviewKitJava {

    public static String revString(String str) {
        List<String> res = new LinkedList<>();
        for(int i = str.length() - 1; i >= 0; i--) {
            res.add(String.valueOf(str.charAt(i))) ;
        }
        return res.stream().collect(Collectors.joining(""));
    }







    public static void main(String[] args) {
        System.out.println(revString("hello"));
    }
}
