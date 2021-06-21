package oop.assignment3.ex41;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws IOException {
        //Create object for filenames class
        FileNames fileNamesObject = new FileNames();
        //Create object for app
        Application app = new Application();
        //read exercise41_input.txt
        List<String> names = app.readFile();
        //call sortFilenames to sort names
        List<String> sortedNames = fileNamesObject.sortFilenames(names);
        //call countFileNames to get amount of names
        int nameCount = fileNamesObject.countFileNames(names);
        //create output with sorted names and count
        String output = app.generateOutput(sortedNames, nameCount);
        //print output string into exercise41_output.txt
        app.printIntoOutputFile(output);
    }

    public List<String> readFile() throws FileNotFoundException {
        //Declare List of Strings
        List<String> Names = new ArrayList<>();
        //open file
        File file = new File("input/exercise41_input.txt");
        //declare scanner to read info from the file
        Scanner in = new Scanner(file);
        //put names into List<>
        while(in.hasNextLine()) {
            Names.add(in.nextLine());
        }
        //return List
        return Names;
    }

    public String generateOutput(List<String> sortedNames, int nameCount) {
        //Create string builder to add on names
        StringBuilder output = new StringBuilder();
        //append first two lines to output since they are not part of the List
        output.append(String.format("Total of %d names\n----------------\n", nameCount));
        //make for loop to print sorted names and append to output
        for(int i=0; i<nameCount; i++) {
            output.append(sortedNames.get(i));
            output.append("\n");
        }
        //return string builder
        return output.toString();
    }

    public void printIntoOutputFile(String output) throws IOException {
        //create FileWriter and set path for output.txt
        FileWriter writer = new FileWriter("output/exercise41_output.txt");
        //print output string to output.txt
        writer.write(String.valueOf(output));
        //make sure to close file
        writer.close();
    }
}