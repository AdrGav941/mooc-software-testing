package tudelft.AdrianGavrila;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AdrianGavrilaTest {
    @Test
    public void testGetFullName() {
        AdrianGavrila testObj = new AdrianGavrila();
        String expected = "Adrian Gavrila";
        Assertions.assertEquals(expected, testObj.getFullName());
    }

    @Test
    public void testGetFirstName() {
        AdrianGavrila testObj = new AdrianGavrila();
        String expected = "Adrian";
        Assertions.assertEquals(expected, testObj.getFirstName());
    }

    @Test
    public void testGetLastName() {
        AdrianGavrila testObj = new AdrianGavrila();
        String expected = "Gavrila";
        Assertions.assertEquals(expected, testObj.getLastName());
    }

    @Test
    public void testGetUCINetID() {
        AdrianGavrila testObj = new AdrianGavrila();
        String expected = "agavrila";
        Assertions.assertEquals(expected, testObj.getUCINetID());
    }

    @Test
    public void testGetStudentNumber() {
        AdrianGavrila testObj = new AdrianGavrila();
        int expected = 90392179;
        Assertions.assertEquals(expected, testObj.getStudentNumber());
    }

    @Test
    public void testGetRotatedFullNamePositive() {
        AdrianGavrila testObj = new AdrianGavrila();
        String expected = "rian GavrilaAd";
        Assertions.assertEquals(expected, testObj.getRotatedFullName(2));
    }

    @Test
    public void testGetRotatedFullNameNegative() {
        AdrianGavrila testObj = new AdrianGavrila();
        String expected = "laAdrian Gavri";
        Assertions.assertEquals(expected, testObj.getRotatedFullName(-2));
    }

    @Test
    public void testGetRotatedFullNameNoRotation() {
        AdrianGavrila testObj = new AdrianGavrila();
        String expected = "Adrian Gavrila";
        Assertions.assertEquals(expected, testObj.getRotatedFullName(0));
    }
}
