package IO;

/**
 * Created by zipcoder on 1/25/17.
 */
public abstract class Display {

    public static String printText(String input){
        System.out.println(input);
        return input;
    }

    public static int printInt(int input){
        System.out.println(input);
        return input;
    }

    public static void newLine(){
        printText("\n");
    }

    public static void startInstructions(){
        printText("TYPE your OPENING paragraph below." +
                "\n Pressing the return (enter) key will submit." +
                "\n _______________________________");
    }

    public static void bodyInstructions(){
        printText("Write your BODY paragraph below." +
                "\n _______________________________");
    }

    public static void closingInstructions(){
        printText("Write your CLOSING paragraph below." +
                "\n ________________________________");
    }

    public static void partingShot(){
        printText("\nCheck test.txt noob.");
    }

}
