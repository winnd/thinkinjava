package ThinkingInJava4th源码code.TIJ4code.annotations.database;//: annotations/database/DBTable.java
import java.lang.annotation.*;

@Target(ElementType.TYPE) // Applies to classes only
@Retention(RetentionPolicy.RUNTIME)
public @interface DBTable {
  public String name() default "";
} ///:~
