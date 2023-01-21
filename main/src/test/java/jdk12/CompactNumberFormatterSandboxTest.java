package jdk12;

import org.junit.jupiter.api.Test;

import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CompactNumberFormatterSandboxTest {

    @Test
    public void sandbox() {
        List<Integer> integers = List.of(
                1,
                150,
                1000,
                1500,
                1700,
                1750,
                2000,
                10000,
                10010,
                10100,
                10500
        );

        List<Locale> locales = List.of(
                Locale.UK,
                Locale.US,
                Locale.GERMAN
        );

        Function<Locale, NumberFormat> shortFormat =  locale ->
                getNumberFormat(locale, NumberFormat.Style.SHORT);

        Function<Locale, NumberFormat> longFormat =  locale ->
                getNumberFormat(locale, NumberFormat.Style.LONG);

        Map<Locale, List<Integer>> localeIntegerMap = locales.stream()
                .collect(Collectors.toMap(Function.identity(), l -> integers));

        System.out.println("Short");
        localeIntegerMap.forEach((locale, integersList) -> integersList
                .forEach(i -> System.out.printf("%s, %s\n", locale.toString(), shortFormat.apply(locale).format(i))));

        System.out.println("Long");
        localeIntegerMap.forEach((locale, integersList) -> integersList
                .forEach(i -> System.out.printf("%s, %s\n", locale.toString(), longFormat.apply(locale).format(i))));
    }

    private NumberFormat getNumberFormat(Locale locale, NumberFormat.Style style) {
        NumberFormat format = NumberFormat.getCompactNumberInstance(locale, style);
        format.setMaximumIntegerDigits(2);
        return format;
    }
}
