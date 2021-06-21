package oop.assignment3.ex41;

import java.util.Collections;
import java.util.List;
//create new class because we have two methods that have to do with Filenames
public class FileNames {

    public List<String> sortFilenames(List<String> names) {
        //Sort names alphabetically
        Collections.sort(names);
        //return List
        return names;
    }

    public int countFileNames(List<String> names) {
        //return amount of names
        return names.size();
    }
}