package oop.assignment3.ex45;

import java.io.FileWriter;
import java.io.IOException;


public class Application {
    public static void main(String[] args) throws IOException {
        //create new object
        Application app = new Application();
        //create object for textManipulation class
        textManipulation tm = new textManipulation();
        //call for method to read input.txt
        String text = tm.readInput();
        //call for method to compare
        String revisedText = tm.findUse(text);
        //call for method to print new string to different txt file
        app.printRevisedText(revisedText);
    }

    public void printRevisedText(String revisedText) throws IOException {
        //create FileWriter and set path for output.txt
        FileWriter writer = new FileWriter("output/exercise45_input.txt");
        //print output string to output.txt
        writer.write(String.valueOf(revisedText));
        //make sure to close file
        writer.close();
    }
}