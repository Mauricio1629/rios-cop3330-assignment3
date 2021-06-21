package oop.assignment3.ex46;

import java.io.FileNotFoundException;
import java.util.Map;

public class Application {
    public static void main(String[] args) throws FileNotFoundException {
        //create object for calling methods
        Application app = new Application();
        StringManipulation sm = new StringManipulation();
        //declare string to receive contents of input.txt
        String text = sm.readFile();
        //declare Map to receive the text changed to a map
        Map<String, String> wordCount = sm.getFrequencyAmount(text);
        //declare String for printing out the the contents of the map
        String histogram = sm.createHistogram(wordCount);
        //Send out the string to be printed
        app.printOutput(histogram);
    }
    //create a method that will read the file and save it to a string


    //create method for printing String histogram
    public void printOutput(String histogram) {
        //print out the histogram as a string
        System.out.print(histogram);
    }
}