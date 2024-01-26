package com.example.mnlib;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LibraryTest {

  @Test
  void someLibraryMethodReturnsTrue() {
    Library classUnderTest = new Library();
    assertTrue(
      classUnderTest.someLibraryMethod(),
      "someLibraryMethod should return 'true'"
    );
  }
}
