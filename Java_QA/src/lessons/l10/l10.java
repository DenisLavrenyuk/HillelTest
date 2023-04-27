package lessons.l10;

import java.util.Arrays;

public class l10 {
    public static void main(String[] args) {
        String string = "animals";
        System.out.println(string.length()); // 7
        System.out.println(string.charAt(0)); // a
         System.out.println(string.charAt(6)); // s
        System.out.println(string.indexOf('a')); // 0
         System.out.println(string.indexOf("al", 5));
        System.out.println(string.substring(3)); // mals
         System.out.println(string.substring(string.indexOf('m'))); // mals
         System.out.println(string.substring(3, 4)); // m
         System.out.println(string.substring(3, 7)); // mals
        System.out.println(string.toUpperCase()); // ANIMALS
         System.out.println("Abc123".toLowerCase()); // abc123
        System.out.println("abc".equals("ABC")); // false
         System.out.println("ABC".equals("ABC")); // true
         System.out.println("abc".equalsIgnoreCase("ABC")); // true
        System.out.println("abc".startsWith("a")); // true
         System.out.println("abc".startsWith("A")); // false
         System.out.println("abc".endsWith("c")); // true
         System.out.println("abc".endsWith("a")); // false
        System.out.println("abc".contains("b")); // true
         System.out.println("abc".contains("B")); // false
        System.out.println("abcabc".replace('a', 'A')); // AbcAbc
         System.out.println("abcabc".replace("a", "A")); // AbcAbc
        System.out.println("abc".trim()); // abc
         System.out.println("\t a b c\n".trim()); // a b c
        System.out.println("\t a b c\n");

        String sentence = "Helllo my dear friend!";
        String[] word = {sentence.substring(0, 3),sentence.substring(3)};
        System.out.println(Arrays.toString(word)  );
        String[] words = sentence.split("l");
        System.out.println(Arrays.toString(words));

        System.out.println(string.length()>0?"Denis":"Dima");
        if("Denis, Dima, Vasya" .contains("Denis")){
            System.out.println("Ok");
        }else {
            System.out.println("Error");
        }
        String result = "\tAniMaL ".trim().toLowerCase().replace('a', 'A');
        System.out.println(result); // Anim(a)Al
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("Den");
        stringBuilder.append(" Lav ");
        stringBuilder.append(33);
        System.out.println(stringBuilder);

        StringBuilder alpha = new StringBuilder();
        for(char current = 'a'; current <= 'z'; current++) {
            alpha.append(current); }
        System.out.println(alpha);

    }
}
