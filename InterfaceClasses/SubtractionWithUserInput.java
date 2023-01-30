package InterfaceClasses;

import java.util.List;

public class SubtractionWithUserInput implements CalculationInterface{
    private int subtractedValue;
    NumberPrompt num = new NumberPrompt();
    List<Integer> values ;
    public int calculation(){
         num.prompt(values);
        subtractedValue = values.get(0) - values.get(1);
        return subtractedValue;
    }
}
