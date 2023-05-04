package lessons.l12;

import java.util.*;

public class l12 {
    public static void main(String[] args) {
        someMethod();
    }

    private static void someMethod() {
        List<String> strings=new ArrayList<>();
        System.out.println(strings.add("Denis"));
        List<String> stringList=new ArrayList<>();
        stringList.add(0,"Dima");
        stringList.addAll(strings);
        System.out.println(stringList);
        System.out.println(stringList.contains("Denis"));
        System.out.println(stringList.get(0));
        System.out.println("Empty "+stringList.isEmpty());

        Map<Integer,String> stringMap=new HashMap<>();
        stringMap.put(1,"Denis");
        System.out.println(stringMap.put(2,"Nicolay"));
        System.out.println(stringMap.entrySet());

       for (String l:stringList){ //perebor
       }
       for (int i=0;i<stringList.size();i++){
           stringList.get(i);
       }
    }
}
