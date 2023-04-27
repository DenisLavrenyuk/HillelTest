package homework.hw10;

import java.util.*;

public class hw10 {
    public static void main(String[] args) {
        String str=" butter, butter,.. milk,, MILK,, meat, cheese ";
        checkString(str);
    }

    public static void checkString(String str) {

        boolean check = str.startsWith(" ");
        if (!check) {
            magicString(str);
        } else {
            str = str.replaceFirst(" ", "");
            magicString(str);
        }
    }
    public static void magicString(String str) {
            String[] words=str.replaceAll("[,.]", "").toLowerCase().split(" ");
            Set<String> set= new HashSet<>();
            Collections.addAll(set, words);
//                    Arrays.asList(words) - analog
//        for (String word:words) {
//            set.add(word);}
            for (String word:set) {
                System.out.println(word.replaceFirst(word.substring(0,1), word.substring(0,1).toUpperCase()));
            }
        }
    }

