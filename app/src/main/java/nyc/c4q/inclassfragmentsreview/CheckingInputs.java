package nyc.c4q.inclassfragmentsreview;

import android.content.Context;
import android.content.res.Resources;

/**
 * Created by amirahoxendine on 12/3/17.
 */

public class CheckingInputs {
    private String editTextString;

    public CheckingInputs (String editTextString){
        this.editTextString = editTextString;

    }
    public String responses() {
        switch (editTextString) {
            case "hello":
                return "Whats up?";
            case "how are you?":
                return "It's complicated...";
            case "what is the meaning of life?":
                return "Hell if I know!";
            case "What day is it?":
                return "What am I, a calendar?!";

            case "what is your name?":
                return "I have no name :(";
            default:
                return "No comment, bro...";
        }
    }



}
