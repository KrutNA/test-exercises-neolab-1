package com.krutna.testexercise;

import static org.junit.Assert.*;

import org.junit.Test;

public class RomeNumberCreatorTest {
  @Test
  public void testConvertingNumbersIntoRomeNumeral() {
    RomeNumberCreator romeNumber = new RomeNumberCreator();

    // Values for tests from En Wikipedia, Rome numerals.

    assertEquals("", romeNumber.from(0));
    assertEquals("XII", romeNumber.from(12));
    assertEquals("MMCIX", romeNumber.from(2109));
    assertEquals("CCXLVI", romeNumber.from(246));
    assertEquals("XXXIX", romeNumber.from(39));
    assertEquals("DCCLXXXIX", romeNumber.from(789));
    assertEquals("CLX", romeNumber.from(160));
    assertEquals("CCVII", romeNumber.from(207));
    assertEquals("MLXVI", romeNumber.from(1066));

    try {
      romeNumber.from(-10);
      fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException e) {
      assertEquals("Rome number must be between 0 and 3999", e.getMessage());
    }
  }
}
