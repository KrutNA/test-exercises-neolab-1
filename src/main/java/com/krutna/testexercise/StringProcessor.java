package com.krutna.testexercise;

public class StringProcessor {

  public final String revertString(String string) {
    return string
        .chars()
        .filter(Character::isAlphabetic)
        .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
        .reverse()
        .toString();
  }
}
