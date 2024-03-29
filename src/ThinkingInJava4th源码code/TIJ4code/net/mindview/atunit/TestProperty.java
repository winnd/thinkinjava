package ThinkingInJava4th源码code.TIJ4code.net.mindview.atunit;//: net/mindview/atunit/TestProperty.java
// The @Unit @TestProperty tag.
import java.lang.annotation.*;

// Both fields and methods may be tagged as properties:
@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface TestProperty {} ///:~
