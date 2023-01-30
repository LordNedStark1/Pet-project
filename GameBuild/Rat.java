package GameBuild;

import java.util.Scanner;

public class Rat {
    int rats;

    public Rat(int numberOfRats){
        rats = numberOfRats;
    }
    public void setRat(int numberOfRats){
        rats += numberOfRats;
    }

    public int getRat(){
        return rats;
    }

    public void dogEffect(int barkRatio){
        if (barkRatio >5 && rats> 0 ){
            rats -=1;
        }
    }
}
