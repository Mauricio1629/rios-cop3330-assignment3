package oop.assignment3.ex41;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationTest {

    @Test
    void testing_printing_sorted_List_assertEquals_true() {
        Application app = new Application();

        List<String> names = new ArrayList<>();
        names.add("Johnson, Jim");
        names.add("Jones, Aaron");
        names.add("Jones, Chris");
        names.add("Ling, Mai");
        names.add("Swift, Geoffrey");
        names.add("Xiong, Fong");
        names.add("Zarnecki, Sabrina");

        int count = 7;

        String expected = """
                Total of 7 names
                ----------------
                Johnson, Jim
                Jones, Aaron
                Jones, Chris
                Ling, Mai
                Swift, Geoffrey
                Xiong, Fong
                Zarnecki, Sabrina
                """;

        String output = app.generateOutput(names, count);

        assertEquals(expected, output);
    }
}