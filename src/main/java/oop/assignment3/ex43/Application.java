package oop.assignment3.ex43;


import java.io.*;
import java.util.Scanner;

public class Application {
    public Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        //create object for Application
        Application app = new Application();
        //create object for website to use methods
        Website wb = new Website();
        //prompt for name of the site
        String websiteName = app.getAnswer("Enter the website name: ");
        //create directory with name
        StringBuilder concat = wb.createDir(websiteName);
        //prompt for author of the site
        String authorName = app.getAnswer("Enter the author name: ");
        //create HTML file
        concat = wb.createHTML(concat, websiteName, authorName);
        //ask user if folder for JavaScript files are needed
        String  jsAnswer = app.getAnswer("Do you want a folder for JavaScript? ");
        //create JavaScript Folder if needed
        concat = wb.createJSFolder(concat, jsAnswer, websiteName);
        //ask user if folder for CSS files are needed
        String  cssAnswer = app.getAnswer("Do you want a folder for CSS? ");
        //create CSS folder if needed
        concat = wb.createCSSFolder(concat, cssAnswer, websiteName);
        //change stringBuilder to string for printing outputs
        String output = app.generateOutput(concat);
        //print results
        app.printOutput(output);
    }

    public String getAnswer(String prompt) {
        //print prompt for the specific question
        System.out.print(prompt);
        //return string
        return in.nextLine();
    }

    public String generateOutput(StringBuilder concat) {
        //Change the StringBuilder to string for printing and return
        return concat.toString();
    }
    public void printOutput(String output) {
        //print output
        System.out.print(output);
    }
}