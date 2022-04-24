package problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DesignUndergroundSystemTester {

    @Test
    public void example1(){
        DesignUndergroundSystem  undergroundSystem = new DesignUndergroundSystem();
        undergroundSystem.checkIn(45, "Leyton", 3);
        undergroundSystem.checkIn(32, "Paradise", 8);
        undergroundSystem.checkIn(27, "Leyton", 10);
        undergroundSystem.checkOut(45, "Waterloo", 15);
        undergroundSystem.checkOut(27, "Waterloo", 20);
        undergroundSystem.checkOut(32, "Cambridge", 22);
        assertEquals(14.00000,undergroundSystem.getAverageTime("Paradise", "Cambridge"));
        assertEquals(11.00000,undergroundSystem.getAverageTime("Leyton", "Waterloo"));
        undergroundSystem.checkIn(10, "Leyton", 24);
        assertEquals(11.00000,undergroundSystem.getAverageTime("Leyton", "Waterloo"));
        undergroundSystem.checkOut(10, "Waterloo", 38);
        assertEquals(12.00000,undergroundSystem.getAverageTime("Leyton", "Waterloo"));
    }

    @Test
    public void example2(){
        DesignUndergroundSystem  undergroundSystem = new DesignUndergroundSystem();
        undergroundSystem.checkIn(10, "Leyton", 3);
        undergroundSystem.checkOut(10, "Paradise", 8);
        assertEquals(5.00000,undergroundSystem.getAverageTime("Leyton", "Paradise"));
        undergroundSystem.checkIn(5, "Leyton", 10);
        undergroundSystem.checkOut(5, "Paradise", 16);
        assertEquals(5.50000,undergroundSystem.getAverageTime("Leyton", "Paradise"));
        undergroundSystem.checkIn(2, "Leyton", 21);
        undergroundSystem.checkOut(2, "Paradise", 30);
        assertEquals(6.666666666666667,undergroundSystem.getAverageTime("Leyton", "Paradise"));
    }
}
