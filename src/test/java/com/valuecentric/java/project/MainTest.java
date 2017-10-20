package com.valuecentric.java.project;


import org.testng.annotations.Test;

import static junit.framework.Assert.assertEquals;


public class MainTest {
  @Test
  public void shouldReturnText() {
    String str = Main.getHelloWorld();
    assertEquals("Did not return expected string", "Hello World!", str);
  }
}
