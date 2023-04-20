package lessons.l5;

public class lesson5 {
    public static void main(String[] args) {
        int age=34;
        String str="Denis";
        String str2=null; //printInfo(age,str);
        printInfo();
        System.out.println(str2);
        printInfo(2023, age, 555, 5 ,10 );
        System.out.println(printInfo("Denis", 17));
        System.out.println(printInfo("Denis", 19).toUpperCase().replace("DEN","")+age);
    }
    public static void printInfo(){
        System.out.println("Hello");
    }
    public static void printInfo(int number,String name, int numb){
int res=2023-number;
        System.out.println(name+" "+res);
    }
    public static String printInfo(int number, String name){
        int res=2023-number;
        return name+" "+res;
    }
    //ku4a - Varars
    public static void printInfo (int year, int... numbers){
        for (int i=0; i< numbers.length;i++){
            year=year-numbers[i];
            System.out.println(year);
        }
    }
    public static String printInfo (String name,int age){
        if (age<18){
            return "Error";
        }
        return name+" "+age;
    }
}
