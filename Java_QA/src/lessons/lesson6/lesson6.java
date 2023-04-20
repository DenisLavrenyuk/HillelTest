package lessons.lesson6;

public class lesson6 {
    public static void main(String[] args) {
        int[] ints=new int[]{1,2,3,4,5,6,5};
        String str="Sharik";
        String[] strings={"fvhvhf",str, "GBGBGY"};
        System.out.println(strings[2].length());
        Human denis = new Human("Denis", 34);
        Human lena = new Human("Lena", 27);
        Human[] hum = new Human[]{
                new Human("Oleg",22)
        };
        Human[] humans = new Human[4];
        humans[0] = denis;
        humans[1] = lena;

//denis.age=34;
//denis.family="Lavrenyuk";
//denis.sex="male";
//lena.name="Olga";
        printInfo(denis);
        System.out.println("====");
     Human man=new Human("Denis", 30, "Lavrenyuk", "male");
     humans[2]=man;
        printInfo(humans);
    }

    public static void printInfo(Human human) {
        System.out.println("name = " + human.name);
        System.out.println("name = " + human.age * 365);
    }

    public static Human printInfo(Human[] human) {
        for (Human l : human) {
            if (l != null) {
                //System.out.println("name = " + l.name);
                //System.out.println("name = " + l.age * 365);
                printInfo(l);
            }
        }
        return null;
    }
}
