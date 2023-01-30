package Game;

public class Rat {
    static int effect ;
    static DogInterface dog  ;
    public static void dogBArkEffect(){
        dog = new LocalDog();
         effect = dog.getDogBark();
    }

//    public static void main(String[] args) {
//        System.out.println(Rat.effect);
//    }
}
