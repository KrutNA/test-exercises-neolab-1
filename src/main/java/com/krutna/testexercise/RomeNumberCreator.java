package com.krutna.testexercise;

import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;

/**
 * Class, which represents working with Rome numeral format, such as converting into it
 *
 * @author KrutNA
 */
public class RomeNumberCreator {

  private static final TreeMap<Integer, String> map = new TreeMap<>();

  static {
    map.put(1000, "M");
    map.put(900, "CM");
    map.put(500, "D");
    map.put(400, "CD");
    map.put(100, "C");
    map.put(90, "XC");
    map.put(50, "L");
    map.put(40, "XL");
    map.put(10, "X");
    map.put(9, "IX");
    map.put(5, "V");
    map.put(4, "IV");
    map.put(1, "I");
  }

  /**
   * Converts integer value to Rome numeral format in String.
   *
   * @param value Value which will be converted to Rome numeral.
   * @return String, which represents resulted Rome numeral, returns empty String, if value equals
   *     0.
   * @throws IllegalArgumentException if value is out of Rome numeral boundaries (0..4000)
   */
  public final String from(final int value) {
    final List<String> digits = new LinkedList<>();

    get(digits, value);

    return digits.stream().collect(Collectors.joining());
  }

  private final void get(final List<String> collection, final int value) {
    if (value < 0) throw new IllegalArgumentException("Rome number must be between 0 and 3999");
    if (value == 0) return;

    final int minimal = map.floorKey(value);

    for (int i = 0; i < value / minimal; ++i) collection.add(map.get(minimal));

    get(collection, value % minimal);
  }
}
