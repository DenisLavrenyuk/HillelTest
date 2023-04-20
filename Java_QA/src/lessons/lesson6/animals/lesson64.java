package lessons.lesson6.animals;

public class lesson64 {
    public static void main(String[] args) {

        Bird bird=new Bird("doly",1,"green",10);
        Mammal mammal=new Mammal("Spyke",1,true,"red");
        Parrot parrot=new Parrot("Flacky",4,"green",10);
        System.out.println(bird.getName());
        System.out.println(mammal.getName());
        mammal.breath();
        bird.breath();
        parrot.fly();
        Tiger tiger=new Tiger("Jorge",6,"Red");
        System.out.println(tiger.color);
        System.out.println(tiger.getName());
        System.out.println(tiger.predator);

    }


}