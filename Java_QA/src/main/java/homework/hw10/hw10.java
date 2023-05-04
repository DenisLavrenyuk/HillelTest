package homework.hw10;

import java.util.*;

public class hw10 {
    public static void main(String[] args) {
        magicString(" butter, butter,  milk, MILK,    meat, cheese.");
    }

    public static void magicString(String str) {
        Set<String> set= new HashSet<>(Arrays.asList(str.toLowerCase().replaceAll("[ .]", "").split(",")));
            for (String word:set) {
                System.out.println(word.replaceFirst(word.substring(0,1), word.substring(0,1).toUpperCase()));
            }
        }
    }

