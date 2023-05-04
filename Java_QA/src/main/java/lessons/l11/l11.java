package lessons.l11;

import java.util.*;

public class l11 {
    public static void main(String[] args) {
        checkString(" butter, butter,.. milk,, MILK,, meat, cheese ");
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
        Set<String> set= new HashSet<>(Arrays.asList(words));
//            Collections.addAll(set, words);
//                    Arrays.asList(words) - analog
//        for (String word:words) {
//            set.add(word);}
        for (String word:set) {
//                System.out.println(word.replaceFirst(word.substring(0,1), word.substring(0,1).toUpperCase()));
            System.out.println(word.substring(0,1).toUpperCase()+ word.substring(1));
        }
    }
}

