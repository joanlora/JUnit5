package rxwriter.prescription;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DurationParserTest { // crtl + shift + t = create test shortcut
    @Test
    public void parseDurationWithValidUnitAndQuantity(){
        assertEquals(14,DurationParser.parseDays("2 weeks"));
        assertEquals(30,DurationParser.parseDays("1 month"));
        doSomething();
    }

    private void doSomething(){
        System.out.println("do something!");
    }

}