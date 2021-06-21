package oop.assignment3.ex44;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    //declare scanner
    Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        //declare application object
        Application app = new Application();
        //create file path to read input
        File input = new File("input/exercise44_input.json");
        //create List to store contents of the file
        List<Products> productsList = app.loadFiles(input);
        //get word you want to search the list for
        String search = app.getSearch();
        //print the output when a match is found
        String output = app.matchSearch(productsList, search);
        //print output
        app.printOutput(output);
    }

    public List<Products> loadFiles(File input) {
        //declare productsList
        List<Products> productsList = new ArrayList<>();
        try {
            JsonElement fileElement = JsonParser.parseReader(new FileReader(input));
            JsonObject fileObject = fileElement.getAsJsonObject();

            JsonArray jsonArrayOfProducts = fileObject.get("products").getAsJsonArray();
            for(JsonElement productElement : jsonArrayOfProducts) {
                JsonObject productJsonObject = productElement.getAsJsonObject();

                String name = productJsonObject.get("name").getAsString();
                Double price = productJsonObject.get("price").getAsDouble();
                Integer quantity = productJsonObject.get("quantity").getAsInt();

                Products product = new Products(name, price, quantity);
                productsList.add(product);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return productsList;
    }

    public String getSearch() {
        //print search prompt to get user search word
        System.out.print("What is the product name? ");
        return in.next();
    }

    public String matchSearch(List<Products> productsList, String search) {
        //declare string to send add string
        String output = "";
        //while loop in case word is not matched within the file
        boolean gotIt = true;
        do {
            //loop through the list to match the search string
            for (Products products : productsList) {
                //if search string is matched print the information of that word
                if (products.name.equalsIgnoreCase(search)) {
                    System.out.println(products);
                    //boolean to false to escape while loop
                    gotIt = false;
                }
            }
            //in case boolean is still true
            if(gotIt) {
                //print error message to promopt the user for another input
                System.out.print("Sorry, that product was not found in our inventory.\nWhat is the product name? ");
                search = in.next();
            }
        } while(gotIt);
        //return the information out the found search string
        return output;
    }
    //print the output
    public void printOutput(String output) {
        System.out.print(output);
    }
}