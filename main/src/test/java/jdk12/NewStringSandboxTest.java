package jdk12;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NewStringSandboxTest {

    @Test
    public void textIndent() {
        String code = "var k = 10;\n" +
                "for (int i = 0; i < k; i++) {\n" +
                "if (i % 2 == 0) {\n" +
                "k++;\n" +
                "}\n" +
                "}\n" +
                "return 0;\n";

        Integer tabulator = 4;
        Integer indent = 0;
        List<String> lines = new ArrayList<>();
        for (String line : code.lines().collect(Collectors.toList())) {
            if (line.endsWith("}")) {
                indent -= tabulator;
            }
            lines.add(line.indent(indent));
            if (line.endsWith("{")) {
                indent += tabulator;
            }
        }
        // print
        lines.forEach(System.out::print);

        // clear indent
        lines = lines.stream()
                .map(line -> line.indent(-100))
                .collect(Collectors.toList());

        lines.forEach(System.out::print);
    }

    @Test
    public void transform() {
        String text = "This is some text";
        String transformed = text.transform(getTransformer());

        assertEquals("THIS IS SOME TEXT", transformed);
    }

    private Function<String, String> getTransformer() {
        return String::toUpperCase;
    }
}
