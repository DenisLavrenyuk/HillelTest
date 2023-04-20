package lessons.lesson9;

import java.util.Arrays;

public class lesson9 {
    public static void main(String[] args) {
        int t;
        t = getTemp(SEASON.WINTER);
        System.out.println("t= " + t);
        get(SEASON.WINTER);
        print(SEASON.WINTER);
        printAllInfo();
        System.out.println(Arrays.toString(SEASON.values()));
        SEASON s=SEASON.valueOf("SUMMER");
        print(s);
    }
    public static void printAllInfo(){
        for(SEASON season: SEASON.values()){
            System.out.println(season.getDays()+" "+season.getT()+" "+season.getSinopt());
        }
    }
    public static void print(SEASON season){
        System.out.println(season.getDays()+" "+season.getT()+" "+season.getSinopt());
    }
    public static void get(SEASON season){
        if(season.getT()<1){
            System.out.println("very cold");
        }
    }
    public static int getTemp(SEASON season) {
        switch (season) {
            case SPRING -> {
                return 15;
            }
            case SUMMER -> {
                return 30;
            }
            case WINTER -> {
                return -5;
            }
        }

        return 0;
    }
}

