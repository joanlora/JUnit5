package rxwriter.prescription;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DurationUnitTest { // test in ide then test in terminal then upload to repo

    @Test
    public void matchUnitBySingularString() {
        assertEquals(DurationUnit.WEEK, DurationUnit.getByTextValue("week"));
    }

    @Test
    public void matchUnitByPluralString() {
        assertEquals(DurationUnit.WEEK, DurationUnit.getByTextValue("weeks"));
    }



}