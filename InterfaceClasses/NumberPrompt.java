package InterfaceClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberPrompt {
    static Scanner scan = new Scanner(System.in);
//    int number;
    public  List<Integer> prompt() {
        List<Integer> values = new ArrayList<>();

        System.out.println("Enter number to calculate or enter no to end");
        String number1 = scan.next();


           int number = Integer.parseInt(number1);
            values.add(number);



        while (!number1.equals("no")) {

            System.out.println("Enter number to calculate or enter no to end");
            number1 = scan.next();

            if (!number1.equalsIgnoreCase("no")) {
                number = Integer.parseInt(number1);
                values.add(number);
            }

        }
        values.removeAll(values);
        return values;

    }


    public static void clear(List<Integer> intArrayList) {
        intArrayList.removeAll(intArrayList);
    }




    public static void main(String[] args) {
//
//
//        Scanner input = new Scanner(System.in);
//        List<Integer> values = new ArrayList<>();
//       for (int i =1; i <20; i++){
//           values.add(i+4);
//       }
//        System.out.print(values);
//        values.removeAll(values);
//        System.out.println(values);

    }
}