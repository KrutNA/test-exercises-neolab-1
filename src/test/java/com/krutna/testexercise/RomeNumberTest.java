package com.krutna.testexercise;

import static org.junit.Assert.*;

import org.junit.Test;

public class RomeNumberTest {
  @Test
  public void testAppHasAGreeting() {
    RomeNumber romeNumber = new RomeNumber();

    assertEquals("XII", romeNumber.from(12));
    assertEquals("MMCIX", romeNumber.from(2109));
    assertEquals("CCXLVI", romeNumber.from(246));
    assertEquals("XXXIX", romeNumber.from(39));
    assertEquals("DCCLXXXIX", romeNumber.from(789));
    assertEquals("CLX", romeNumber.from(160));
    assertEquals("CCVII", romeNumber.from(207));
    assertEquals("MLXVI", romeNumber.from(1066));
  }
}
