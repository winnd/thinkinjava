package ThinkingInJava4th源码code.TIJ4code.annotations;//: annotations/ExtractInterface.java
// APT-based annotation processing.
import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)
public @interface ExtractInterface {
  public String value();
} ///:~
