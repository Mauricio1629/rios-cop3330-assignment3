package oop.assignment3.ex46;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class StringManipulation {

    public String readFile() throws FileNotFoundException {
        //Declare text to add on each line from input.txt
        StringBuilder text = new StringBuilder();
        //get file path to open it
        File file = new File("input/exercise46_input.txt");
        //Declare scanner to be able to read the txt file
        Scanner in = new Scanner(file);
        //While loop to read file and put in StringBuilder
        while(in.hasNextLine()) {
            text.append(in.nextLine());
        }
        //return as a string
        return text.toString();
    }
    //create a method that will store String to a Map<String,String>. <word,amount of * for repetition>
    public Map<String,String> getFrequencyAmount(String text) {
        //declare Map<String,String>
        Map<String,String> wordCount = new TreeMap<>();

        //split to find the word
        String[] arr =text.split(" ");

        //loop to iterate over the words
        for (String s : arr) {
            // Condition to check if the
            // array element is present
            // the hash-map
            if (wordCount.containsKey(s)) {
                wordCount.put(s, wordCount.get(s) + "*");
            } else {
                wordCount.put(s, "*");
            }
        }
        //return map
        return wordCount;
    }
    //create method to print all lines of the Map
    public String createHistogram(Map<String,String> wordCount) {
        //declare StringBuilder to receive each line of Map to print
        StringBuilder histogram = new StringBuilder();
        //for loop to get each line of Map and append to stringBuilder
        for(Map.Entry<String,String> entry:
                wordCount.entrySet())
        {
            histogram.append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
        }
        //return as a string for printing
        return histogram.toString();
    }
}