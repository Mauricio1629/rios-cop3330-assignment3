package oop.assignment3.ex46;

import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.*;

class StringManipulationTest {

    @Test
    void testing_getFrequencyAmount_with_default_example_assert_true() {
        StringManipulation sm = new StringManipulation();

        String text = "badger badger badger badger mushroom mushroom snake badger badger badger ";
        Map<String,String> wordCount = new TreeMap<>();
        wordCount.put("badger","*******");
        wordCount.put("mushroom","**");
        wordCount.put("snake","*");

        Map<String,String> output = sm.getFrequencyAmount(text);

        boolean isEquals = wordCount.equals(output);
        assertTrue(isEquals);
    }

    @Test
    void testing_getFrequencyAmount_with_different_text() {
        StringManipulation sm = new StringManipulation();

        String text = "difo juice music music difo difo music difo";
        Map<String,String> wordCount = new TreeMap<>();
        wordCount.put("difo","****");
        wordCount.put("music","***");
        wordCount.put("juice","*");

        Map<String,String> output = sm.getFrequencyAmount(text);

        boolean isEquals = wordCount.equals(output);
        assertTrue(isEquals);
    }

    @Test
    void testing_getFrequencyAmount_comparing_output_to_different_map_assert_false() {
        StringManipulation sm = new StringManipulation();

        String text = "badger badger badger badger mushroom mushroom snake badger badger badger ";
        Map<String,String> wordCount = new TreeMap<>();
        wordCount.put("difo","****");
        wordCount.put("music","***");
        wordCount.put("juice","*");

        Map<String,String> output = sm.getFrequencyAmount(text);

        boolean isEquals = wordCount.equals(output);
        assertFalse(isEquals);
    }

    @Test
    void testing_createHistogram_with_example_inputs_assertEquals_true() {
        StringManipulation sm = new StringManipulation();
        String expected = """
                badger: *******
                mushroom: **
                snake: *
                """;
        Map<String,String> wordCount = new TreeMap<>();
        wordCount.put("badger","*******");
        wordCount.put("mushroom","**");
        wordCount.put("snake","*");

        String output = sm.createHistogram(wordCount);

        assertEquals(expected, output);

    }

    @Test
    void testing_createHistogram_with_different_inputs_assertEquals_true() {
        StringManipulation sm = new StringManipulation();
        String expected = """
                apple: ****
                mango: ***
                orange: **
                """;
        Map<String,String> wordCount = new TreeMap<>();
        wordCount.put("apple","****");
        wordCount.put("mango","***");
        wordCount.put("orange","**");

        String output = sm.createHistogram(wordCount);

        assertEquals(expected, output);
    }
}