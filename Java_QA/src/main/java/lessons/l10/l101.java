package lessons.l10;
import lessons.l6.Human;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class l101 {
    public static void main(String[] args) {
List<String> arrayList=new ArrayList();
arrayList.add("Denis");
arrayList.add(0, "34");
arrayList.add(new Human().toString());
arrayList.contains("Denis");
// arrayList.remove(1);

for (String element:arrayList){
    System.out.println(element.toUpperCase());
}
String str="5";
int n=5+Integer.parseInt(str);
        System.out.println(n);
    }
}
