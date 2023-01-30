package Game;

import java.security.SecureRandom;

public class LocalDog  implements DogInterface {
    SecureRandom rando =new SecureRandom();
    private int LocalDogHealth;
    private int bark;

    public void feed(int food) {

    }

    public int getLocalDogHealth() {
        return LocalDogHealth;
    }


    public void dogBark() {
        bark = 1+ rando.nextInt(10);
    }


    public int getDogBark() {
        bark = 1+ rando.nextInt(10);
        return bark;
    }
}
