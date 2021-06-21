package oop.assignment3.ex45;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class textManipulation {
    public String readInput() throws FileNotFoundException {
        //Declare StringBuilder to write input.txt into
        StringBuilder text = new StringBuilder();
        //Open the input.txt file
        File file = new File("input/exercise45_input.txt");
        //Declare scanner to be able to read the txt file
        Scanner in = new Scanner(file);
        //While loop to read file and put in StringBuilder
        while(in.hasNextLine()) {
            text.append(in.nextLine()).append("\n");
        }
        //return as a string
        return text.toString();
    }

    public String findUse(String text) {
        //declare new string to copy revised version of the text
        String revisedText;
        //replace all "utilize" with "use"
        revisedText = text.replaceAll("utilize|UTILIZE|Utilize|utilize.|utilize!", "use");
        //return revised string
        return revisedText;
    }
}