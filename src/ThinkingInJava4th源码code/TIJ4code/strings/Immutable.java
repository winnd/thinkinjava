package ThinkingInJava4th源码code.TIJ4code.strings;//: strings/Immutable.java

import static ThinkingInJava4th源码code.TIJ4code.net.mindview.util.Print.print;

public class Immutable {
  public static String upcase(String s) {
    return s.toUpperCase();
  }
  public static void main(String[] args) {
    String q = "howdy";
    print(q); // howdy
    String qq = upcase(q);
    print(qq); // HOWDY
    print(q); // howdy
  }
} /* Output:
howdy
HOWDY
howdy
*///:~
