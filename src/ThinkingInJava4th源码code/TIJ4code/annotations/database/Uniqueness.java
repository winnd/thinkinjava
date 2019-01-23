package ThinkingInJava4th源码code.TIJ4code.annotations.database;//: annotations/database/Uniqueness.java
// Sample of nested annotations


public @interface Uniqueness {
  Constraints constraints()
    default @Constraints(unique=true);
} ///:~
