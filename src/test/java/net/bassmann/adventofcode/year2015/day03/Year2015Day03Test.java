package net.bassmann.adventofcode.year2015.day03;

import static org.junit.jupiter.api.Assertions.assertEquals;

import net.bassmann.adventofcode.common.Day;
import org.junit.jupiter.api.Test;

class Year2015Day03Test {

  private final Day today = new Year2015Day03();

  @Test
  void solvePart1() {
    assertEquals("2592", today.solvePart1());
  }

  @Test
  void solvePart2() {
    assertEquals("2360", today.solvePart2());
  }
}