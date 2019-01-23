package ThinkingInJava4th源码code.TIJ4code.annotations;//: annotations/AtUnitExample1.java

import ThinkingInJava4th源码code.TIJ4code.net.mindview.atunit.Test;

public class AtUnitExample1 {
  public String methodOne() {
    return "This is methodOne";
  }
  public int methodTwo() {
    System.out.println("This is methodTwo");
    return 2;
  }
  @Test
  boolean methodOneTest() {
    return methodOne().equals("This is methodOne");
  }
  @Test
  boolean m2() { return methodTwo() == 2; }
  @Test
  private boolean m3() { return true; }
  // Shows output for failure:
  @Test
  boolean failureTest() { return false; }
  @Test
  boolean anotherDisappointment() { return false; }
  public static void main(String[] args) throws Exception {
    net.mindview.util.OSExecute.command(
      "java AtUnit AtUnitExample1");
  }
} /* Output:
annotations.AtUnitExample1
  . methodOneTest
  . m2 This is methodTwo

  . m3
  . failureTest (failed)
  . anotherDisappointment (failed)
(5 tests)

>>> 2 FAILURES <<<
  annotations.AtUnitExample1: failureTest
  annotations.AtUnitExample1: anotherDisappointment
*///:~
