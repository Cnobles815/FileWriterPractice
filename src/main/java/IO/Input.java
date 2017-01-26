package IO;

import java.util.Scanner;

/**
 * Created by zipcoder on 1/25/17.
 */
public abstract class Input {
    private static String inputValue;

    static Scanner input = new Scanner(System.in);

    public static String stringInput(){
        String temp = input.nextLine();
        return temp;
    }

    public static void setInputValue(String newInputValue){
        inputValue = newInputValue;
    }

    public static String getInputValue(){
        return inputValue;
    }
}
