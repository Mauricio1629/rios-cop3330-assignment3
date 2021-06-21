package oop.assignment3.ex45;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class textManipulationTest {

    @Test
    void findUse() {
        textManipulation tm = new textManipulation();
        String text = """
                One should never utilize the word "utilize" in writing. Use "use" instead.
                For example, "She uses an IDE to write her Java programs" instead of "She
                utilizes an IDE to write her Java programs".""";

        String expected = """
                One should never use the word "use" in writing. Use "use" instead.
                For example, "She uses an IDE to write her Java programs" instead of "She
                uses an IDE to write her Java programs".""";


        String output = tm.findUse(text);

        assertEquals(expected, output);
    }

    @Test
    void testing_findUse_replacing_utilize_with_use_but_with_a_different_cases_on_the_word_utilize() {
        textManipulation tm = new textManipulation();
        String text = """
                This text is to test that the word utilize is changed to the word use!
                We need to test a different string to see if utilize is actually changed.
                Utilize UTILIZE utilize!""";

        String expected = """
                This text is to test that the word use is changed to the word use!
                We need to test a different string to see if use is actually changed.
                use use use!""";


        String output = tm.findUse(text);

        assertEquals(expected, output);
    }
}