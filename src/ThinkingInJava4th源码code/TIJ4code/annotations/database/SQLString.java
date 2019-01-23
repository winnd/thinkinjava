package ThinkingInJava4th源码code.TIJ4code.annotations.database;//: annotations/database/SQLString.java
import ThinkingInJava4th源码code.TIJ4code.annotations.database.Constraints;

import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface SQLString {
  int value() default 0;
  String name() default "";
  Constraints constraints() default @Constraints;
} ///:~
