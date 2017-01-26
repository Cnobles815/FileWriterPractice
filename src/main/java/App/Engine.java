package App;

import IO.Display;
import IO.Input;
import IO.Output;

import java.io.IOException;

/**
 * Created by zipcoder on 1/25/17.
 */
public class Engine {

    Text text = new Text();

    public void programStart() throws IOException {
        Display.startInstructions();
        Display.newLine();
        Display.newLine();
        text.setOpening(Input.stringInput());
        Display.newLine();
        Display.printText(text.getOpening());
        Display.newLine();
        Output.fileWrite(text.getOpening());
        programContinue();
    }

    public void programContinue() throws IOException {
        Display.bodyInstructions();
        Display.newLine();
        Display.newLine();
        text.setBody(Input.stringInput());
        Display.newLine();
        Display.printText(text.getBody());
        Display.newLine();
        Output.fileWrite(text.getBody());
        programEnd();
    }

    public void programEnd() throws IOException {
        Display.closingInstructions();
        Display.newLine();
        Display.newLine();
        text.setClosing(Input.stringInput());
        Display.newLine();
        Display.printText(text.getClosing());
        Display.newLine();
        Output.fileWriteFinal(text.getClosing());
        Display.partingShot();
    }

}
