package com.krutna.testexercise;

/**
 * Class for processing Strings into other forms or convering into over types
 *
 * @author KrutNA
 */
public class StringProcessor {

  /**
   * This method clears string from all non-alphabetical symbols and then reverses it.
   *
   * @param string The String to be used to get new filtered and reversed string.
   * @return String resulted value, if no alphabetical symbols, then returns empty String.
   */
  public final String revertString(final String string) {
    return string
        .chars()
        .filter(Character::isAlphabetic)
        .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
        .reverse()
        .toString();
  }
}
