package oop.assignment3.ex41;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FileNamesTest {

    @Test
    void testing_sortFileNames_comparing_sorted_list_to_method_list_assert_true() {
        FileNames fileNamesObject = new FileNames();

        List<String> names = new ArrayList<>();
        names.add("Ling, Mai");
        names.add("Johnson, Jim");
        names.add("Zarnecki, Sabrina");
        names.add("Jones, Chris");
        names.add("Jones, Aaron");
        names.add("Swift, Geoffrey");
        names.add("Xiong, Fong");

        List<String> expected = new ArrayList<>();
        expected.add("Johnson, Jim");
        expected.add("Jones, Aaron");
        expected.add("Jones, Chris");
        expected.add("Ling, Mai");
        expected.add("Swift, Geoffrey");
        expected.add("Xiong, Fong");
        expected.add("Zarnecki, Sabrina");

        boolean equals = true;

        List<String> output = fileNamesObject.sortFilenames(names);

        for (int i = 0; i < names.size(); i++) {
            if (!expected.get(i).equals(output.get(i))) {
                equals = false;
                break;
            }
        }
        assertTrue(equals);
    }

    @Test
    void testing_sortFileNames_comparing_wrong_sorted_list_to_method_list_assert_false() {
        FileNames fileNamesObject = new FileNames();

        List<String> names = new ArrayList<>();
        names.add("Ling, Mai");
        names.add("Johnson, Jim");
        names.add("Zarnecki, Sabrina");
        names.add("Jones, Chris");
        names.add("Jones, Aaron");
        names.add("Swift, Geoffrey");
        names.add("Xiong, Fong");

        List<String> wrongList = new ArrayList<>();
        wrongList.add("Xiong, Fong");
        wrongList.add("Swift, Geoffrey");
        wrongList.add("Johnson, Jim");
        wrongList.add("Jones, Aaron");
        wrongList.add("Ling, Mai");
        wrongList.add("Zarnecki, Sabrina");
        wrongList.add("Jones, Chris");

        boolean equals = false;

        List<String> output = fileNamesObject.sortFilenames(names);

        for (int i = 0; i < output.size(); i++) {
            if (wrongList.get(i).equals(output.get(i))) {
                equals = true;
                break;
            }
        }
        assertFalse(equals);
    }

    @Test
    void testing_return_value_from_countFileNames_equals_true() {
        FileNames fileNamesObject = new FileNames();

        List<String> names = new ArrayList<>();
        names.add("Ling, Mai");
        names.add("Johnson, Jim");
        names.add("Zarnecki, Sabrina");
        names.add("Jones, Chris");
        names.add("Jones, Aaron");
        names.add("Swift, Geoffrey");
        names.add("Xiong, Fong");

        int expected = 7;

        int output = fileNamesObject.countFileNames(names);

        assertEquals(expected, output);
    }

    @Test
    void testing_return_value_from_countFileNames_equals_false_using_extra_name() {
        FileNames fileNamesObject = new FileNames();

        List<String> names = new ArrayList<>();
        names.add("Ling, Mai");
        names.add("Johnson, Jim");
        names.add("Zarnecki, Sabrina");
        names.add("Jones, Chris");
        names.add("Jones, Aaron");
        names.add("Swift, Geoffrey");
        names.add("Xiong, Fong");
        names.add("Difo, Fido");

        int expected = 7;

        int output = fileNamesObject.countFileNames(names);

        assertNotEquals(expected, output);
    }
}