package lessons.l11;

import java.util.HashMap;
import java.util.Map;

public class l11_3 {
    public static void main(String[] args) {
        Map<Integer,User> userMap=new HashMap<>();
        User user=new User("Den","Lav","pass");
        userMap.put(123,user);
        userMap.put(456,new User("Oleg","Lav","pass"));
        System.out.println(userMap.get(123).getFamily());
        printFamily(userMap);
    }
    private static void printFamily(Map<Integer,User> integerUserMap){
        for (Map.Entry<Integer,User> l:integerUserMap.entrySet()){
            System.out.println(l.getValue().getFamily());
        }
    }
}
