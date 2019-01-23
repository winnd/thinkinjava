package ThinkingInJava4th源码code.TIJ4code.annotations;//: annotations/HashSetTest.java
import java.util.*;

import ThinkingInJava4th源码code.TIJ4code.net.mindview.atunit.Test;
import ThinkingInJava4th源码code.TIJ4code.net.mindview.util.OSExecute;

public class HashSetTest {
  HashSet<String> testObject = new HashSet<String>();
  @Test
  void initialization() {
    assert testObject.isEmpty();
  }
  @Test void _contains() {
    testObject.add("one");
    assert testObject.contains("one");
  }
  @Test void _remove() {
    testObject.add("one");
    testObject.remove("one");
    assert testObject.isEmpty();
  }
  public static void main(String[] args) throws Exception {
    OSExecute.command(
      "java net.mindview.atunit.AtUnit HashSetTest");
  }
} /* Output:
annotations.HashSetTest
  . initialization
  . _remove
  . _contains
OK (3 tests)
*///:~
