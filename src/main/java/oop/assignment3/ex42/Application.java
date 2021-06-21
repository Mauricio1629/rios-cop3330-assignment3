package oop.assignment3.ex42;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Application {

    public static void main(String[] args) throws IOException {
        Application app = new Application();
        //get list with file loaded into it
        List<Worker> workerList = app.getList();
        //print out the list in table format
        app.printTable(workerList);
    }

    //method to load file into a list
    public List<Worker> getList() throws IOException {

        BufferedReader fileIn = null;
        List<Worker> wList = new ArrayList<>();
        try{
            //create the file object
            File file = new File("input/exercise42_input.txt");

            //create bufferedReader object from the File
            fileIn = new BufferedReader(new FileReader(file));

            //create string to receive input from file
            String line;

            //read file line by line
            while((line = fileIn.readLine()) != null) {

                //split the line by ,
                String[] parts = line.split(",");

                //assigning each part of the line to its specific variable
                String last = parts[0].trim();
                String first = parts[1].trim();
                Integer salary = Integer.parseInt(parts[2].trim());

                //put last, first, salary in HashMap if they are not empty
                if(!last.equals("") && !first.equals("") && !salary.equals(0))
                    wList.add(new Worker(last, first, salary));
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        //close bufferedReader
        if(fileIn != null) {
            fileIn.close();
        }
        //return Map
        return wList;
    }

    public void printTable(List<Worker> workerList) {
        //print the titles for the columns
        System.out.printf("%-10s %-10s %-17s\n", "Last", "First", "Salary");
        //print the separator
        System.out.println("-----------------------------");
        //print the List
        workerList.forEach(System.out::println);
    }
}