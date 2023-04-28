package homework.hw11;

import lessons.l11.User;

import java.util.*;

public class hm11 {
    public static void main(String[] args) {
        int[] number={18,11,5,7,10} ; String[] name="Scholes, Giggs, Ferdinand, Beckham, Rooney".replaceAll(" ", "").split(",");
        Map<Integer,String> ManUtd=new HashMap<>();
        for (int t=0;t<number.length;t++){
            ManUtd.put(number[t],name[t]);
        }
        printTeam(ManUtd);
    }
    public static void printTeam(Map<Integer,String> Team) {
        Set<Integer> set=new TreeSet<>(Team.keySet());
        for (int t:set){
            System.out.println(t + "=" + Team.get(t));
        }
    }
}
