package InterfaceClasses;

import java.util.List;

public class AdditionWithUserInput implements CalculationInterface{
    private int addedValue;

    NumberPrompt num = new NumberPrompt();
    List<Integer> values ;
    public int calculation(){
       values.get( num.prompt();
        for (int i= 0; i < values.toArray().length; i ++)
            addedValue += values.get(i) ;

        return addedValue;
    }
}
