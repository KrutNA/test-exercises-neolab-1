package com.krutna.testexercise;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringProcessorTest {
  @Test
  public void testStringProcessorReversing() {
    StringProcessor processor = new StringProcessor();

    assertEquals(processor.revertString("nahsirg"), "grishan");
    assertEquals(processor.revertString("ultr53o?n"), "nortlu");
    assertEquals(processor.revertString("h7dw2366j..L33T"), "TLjwdh");
    assertEquals(processor.revertString("123"), "");
  }
}
