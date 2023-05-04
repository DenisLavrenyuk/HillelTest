package lessons.l11;

import java.util.*;

public class l11_2 {
    public static void main(String[] args) {
        Map<String,String> stringMap=new HashMap<>();
        stringMap.put("name","Denis");
        stringMap.put("phone", "34656");
        stringMap.put("test", "1789");
        for (Map.Entry<String,String> l:stringMap.entrySet()){
            System.out.println(l.getValue());
            System.out.println(l.getKey());
        }
        Set<String> setKey=stringMap.keySet();
        System.out.println(setKey);
//        List<String> listValues=stringMap.values().stream().toList(); - перебирает коллекцию в лист
        List<String> listValues=new ArrayList<>(stringMap.values());
        System.out.println(listValues);
        for (String l:stringMap.keySet()){

        }
    }
}
