package GameBuild;

import java.util.Scanner;

public class GameCenter {
    Scanner input = new Scanner(System.in);
    DogInterface dog;
    public int dogs(){
        dog =new LocalDog();
        return dog.getDogBark();
    }
    public void calls(){
        int numberOfRats = 10;

        Rat rat = new Rat(numberOfRats);
        GameCenter game = new GameCenter();


        System.out.println("Do u want to perform again press 1");
        int option = input.nextInt();

        while (option ==1 ) {
            System.out.println("number of rat is "+ rat.getRat());
            rat.dogEffect(dogs());
            System.out.println("number of rat is "+ rat.getRat());

            System.out.println("DO u want to perform again press 1");
            option = input.nextInt();
        }




    }
}
