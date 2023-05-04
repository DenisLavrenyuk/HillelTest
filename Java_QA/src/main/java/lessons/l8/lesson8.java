package lessons.l8;

public class lesson8 {
    public static void main(String[] args) {
        System.out.println(cc(0, 5, 4, 5, 8, 5, 4, 56, 5, 5, 56, 4, 6584, 6, 54, 658, 46, 84, 9 + 6));
    }
    public static int c(int ... massive){
        int sum=0;
        for(int t:massive){
            sum+=t;
        }
        return sum;
    }
    public  static int cc(int ignore,int index, int ... massive){
        return 0;
    }
}

