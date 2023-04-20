package homework.hw9;
import java.util.Arrays;

public class Output9 {
    public static void main(String[] args) {
        Size hat=Size.valueOf("SMALL");
        System.out.println(hat);
        System.out.println(Arrays.toString(Size.values()));
//        printAllInfo();
//        print(hat);
    }
//    public static void printAllInfo(){
//        for (Size size: Size.values()){
//            System.out.println(size.getBriefName()+" "+size.getWidth()+" "+size.getLength());
//        }
//    }
//    public static void print(Size size){
//        System.out.println(size.getBriefName()+" "+size.getWidth()+" "+size.getLength());
//    }
}
