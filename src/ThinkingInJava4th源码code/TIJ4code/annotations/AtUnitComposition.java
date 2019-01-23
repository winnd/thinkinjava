package ThinkingInJava4th源码code.TIJ4code.annotations;//: annotations/AtUnitComposition.java
// Creating non-embedded tests.

import ThinkingInJava4th源码code.TIJ4code.net.mindview.atunit.Test;

public class AtUnitComposition {
  AtUnitExample1 testObject = new AtUnitExample1();
  @Test
  boolean _methodOne() {
    return
      testObject.methodOne().equals("This is methodOne");
  }
  @Test
  boolean _methodTwo() {
    return testObject.methodTwo() == 2;
  }
  public static void main(String[] args) throws Exception {
    net.mindview.util.OSExecute.command(
     "java AtUnit AtUnitComposition");
  }
} /* Output:
AtUnitComposition
  . _methodOne
  . _methodTwo This is methodTwo

OK (2 tests)
*///:~
