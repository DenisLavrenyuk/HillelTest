package lessons.l11;

import java.util.*;

public class l11_1 {
    public static void main(String[] args) {
        Map<String,String> stringMap=new HashMap<>();
        stringMap.put("name","Denis");
        stringMap.put("phone", "34656");
        System.out.println(stringMap.get("name"));
        System.out.println("isEmpty = "+stringMap.isEmpty());
        System.out.println(stringMap.size());
        System.out.println(stringMap.containsKey("phone"));
        System.out.println(stringMap.containsValue("34656"));
//        Map<String, List<String>> map=new HashMap<>();
//        map.put("tel", new ArrayList<String>(Arrays.asList("4546","7663")));
//        System.out.println(Arrays.toString(map.get("tel").toArray()));

    }
}
