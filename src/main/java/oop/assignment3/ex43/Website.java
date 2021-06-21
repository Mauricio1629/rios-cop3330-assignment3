package oop.assignment3.ex43;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Website {

    public StringBuilder createDir(String websiteName) {
        //declare and initialize stringBuilder
        StringBuilder concat = new StringBuilder();
        //create file path to location for the new folder
        File file = new File("output/"+websiteName);
        if(!file.exists()) {
            if(file.mkdir()) {
                //statement confirming the folder was created
                concat.append("Created ").append(file).append("\n");
            } else {
                //statement showing that website already exists
                concat.append("Error: website already exists\n");
            }
        }
        //return StringBuilder to add more statements
        return concat;
    }

    public StringBuilder createHTML(StringBuilder concat, String websiteName, String authorName) {
        //create file path
        File file = new File("output/"+websiteName+"/index.html");
        //write html string
        String html = "<div><h1>"+websiteName+"</h1><p>"+authorName+"</p></div>";
        try{
            //declare bufferwriter to write in the html file
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            //write the string into the file
            bw.write(html);
            //close the file
            bw.close();
            //write statement showing that the file was created
            concat.append("Created ").append(file).append("\n");
        } catch (IOException e) {
            //write error in case file already exists
            concat.append("Error creating index.html\n");
            e.printStackTrace();
        }
        //return StringBuilder to add more statements
        return concat;
    }


    public StringBuilder createJSFolder(StringBuilder concat, String jsAnswer, String websiteName) {
        //if statement if user would like to create JSFolder
        if(jsAnswer.equalsIgnoreCase("yes")) {
            //create file path
            File file = new File("output/"+websiteName+"/JavaScript");
            //if file does not exist continue
            if(!file.exists()) {
                if(file.mkdir()) {
                    //statement showing that file was created
                    concat.append("Created ").append(file).append("\n");
                } else {
                    //statement in case file already exists
                    concat.append("Error: JavaScript already exists\n");
                }
            }
        }
        //return StringBuilder to add more statements
        return concat;
    }

    public StringBuilder createCSSFolder(StringBuilder concat, String cssAnswer, String websiteName) {
        //if statement if user would like to create cssfolder
        if(cssAnswer.equalsIgnoreCase("yes")) {
            //create file path
            File file = new File("output/"+websiteName+"/CSS");
            //if file does not exist continue
            if(!file.exists()) {
                if(file.mkdir()) {
                    //statement showing that file was created
                    concat.append("Created ").append(file).append("\n");
                } else {
                    //statement in case file already exists
                    concat.append("Error : CSS already exists\n");
                }
            }
        }
        //return StringBuilder to add more statements
        return concat;
    }
}