package jdk16;

import org.junit.jupiter.api.Test;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DayPeriodSupportSandboxTest {

    @Test
    public void sandbox() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("h B")
                .localizedBy(Locale.US);
        assertEquals("3 in the afternoon", LocalTime.parse("15:25").format(formatter));
        assertEquals("8 in the morning", LocalTime.parse("08:25").format(formatter));
        assertEquals("8 in the evening", LocalTime.parse("08:25 PM", DateTimeFormatter.ofPattern("hh:mm a", Locale.US))
                .format(formatter));

    }
}
