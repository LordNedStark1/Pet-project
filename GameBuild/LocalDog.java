package GameBuild;

import java.security.SecureRandom;

public class LocalDog implements DogInterface{
    SecureRandom random = new SecureRandom();
    int bark;
    int feed;
    public void setFood(){
        feed = 1+ random.nextInt(3);
    }

    public int getFood(){

        return feed;
    }

    @Override
    public int getDogBark() {
        setFood();

            if ( getFood() == 1) {
                bark = 1 + random.nextInt(7);

            }
            else if ( getFood() == 2){
                bark = 3+ random.nextInt(8);
            }
            else if ( getFood() == 3){
                bark = 4+ random.nextInt(10);
            }
        return bark;
    }
}
