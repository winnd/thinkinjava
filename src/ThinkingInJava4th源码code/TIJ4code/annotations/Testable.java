//: annotations/Testable.java
package ThinkingInJava4th源码code.TIJ4code.annotations;

import ThinkingInJava4th源码code.TIJ4code.net.mindview.atunit.Test;

public class Testable {
  public void execute() {
    System.out.println("Executing..");
  }
  @Test
  void testExecute() { execute(); }
} ///:~
