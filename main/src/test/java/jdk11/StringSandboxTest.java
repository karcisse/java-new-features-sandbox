package jdk11;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

public class StringSandboxTest {

    @Test
    public void splitToLines() {
        String sampleMultiline = "This is some\n" +
                "multiline\n" +
                "string just to test new features in String\n" +
                "        \n" +
                "class.\n" +
                "YAY\n";
        List<String> result = sampleMultiline.lines()
                .collect(Collectors.toUnmodifiableList());
        assertEquals(6, result.size());
    }

    @Test
    public void isBlank() {
        assertTrue("    ".isBlank());
        assertFalse("    ".isEmpty());
    }

    @Test
    public void testStrip() {
        String sample = "   text    ";
        String sampleWithSomeUnicodeSpaces = "    text    ";
        assertEquals("text", sample.strip());
        assertEquals("text", sample.trim());
        assertEquals("text", sampleWithSomeUnicodeSpaces.strip());
        assertEquals("  text    ", sampleWithSomeUnicodeSpaces.trim());

        assertEquals("text    ", sample.stripLeading());
        assertEquals("text    ", sampleWithSomeUnicodeSpaces.stripLeading());

        assertEquals("   text", sample.stripTrailing());
        assertEquals("    text", sampleWithSomeUnicodeSpaces.stripTrailing());
    }

    @Test
    public void repeat() {
        String sample = "text";
        assertEquals("texttexttext", sample.repeat(3));
    }

}
