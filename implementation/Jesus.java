package implementation;

import java.security.SecureRandom;
import java.util.Scanner;

public class Jesus implements IGod{
    SecureRandom random = new SecureRandom();
    Scanner scan = new Scanner(System.in);
    public void god(){
        System.out.println("saviour and friend");
    }
    public void loop(){
        System.out.println("press 1 to play calculations game!!!\n" +
                "--> any number to end");
        int number= scan.nextInt();
        while (number==1){

            gameDevelopedUsage();

            System.out.println("press 1 to play calculations game!!!\n" +
                    "--> any number to end");
            number= scan.nextInt();
        }
    }
    public void gameDevelopedUsage() {
        int number = 1 + random.nextInt(4);
        switch (number) {
            case 1 -> System.out.println("man");
            case 2 -> System.out.println("woman");
            case 3 -> System.out.println("dog");
            case 4 -> System.out.println("goat");
        }
    }
}
