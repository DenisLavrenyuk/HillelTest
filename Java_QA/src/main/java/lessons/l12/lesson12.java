package lessons.l12;

import lessons.l8.first.Cat;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.BindException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lesson12 {
    public static void main(String[] args) {
        Cat cat;
        List<String> stringsList=new ArrayList<>(Arrays.asList("Denis","dima"));
        int integer=0;
        try {
integer=9;
            System.out.println(stringsList.get(3));
        }catch (RuntimeException e){
//            e.printStackTrace();
            System.out.println(stringsList.get(stringsList.size()-1));
        }
        try {
            getSomething();
        } catch (FileNotFoundException i){
//            System.out.println(i.getMessage());
            i.printStackTrace();
        }catch (IOException e){
            System.out.println("Check");
            e.printStackTrace();
        }

    }

    public static void getSomething() throws IOException { //probros exceptiona
//        throw new FileNotFoundException("Hello Denis");
        throw new BindException("Hello Denis");

    }
}
