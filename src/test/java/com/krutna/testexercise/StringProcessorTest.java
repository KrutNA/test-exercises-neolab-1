package com.krutna.testexercise;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringProcessorTest {
  @Test
  public void testStringProcessorReversing() {
    StringProcessor processor = new StringProcessor();

    assertEquals("grishan", processor.revertString("nahsirg"));
    assertEquals("nortlu", processor.revertString("ultr53o?n"));
    assertEquals("TLjwdh", processor.revertString("h7dw2366j..L33T"));
    assertEquals("", processor.revertString("123"));
  }
}
