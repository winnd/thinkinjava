package ThinkingInJava4th源码code.TIJ4code.swt;//: swt/DisplayEnvironment.java
import ThinkingInJava4th源码code.TIJ4code.swt.util.SWTApplication;
import ThinkingInJava4th源码code.TIJ4code.swt.util.SWTConsole;
import org.eclipse.swt.*;
import org.eclipse.swt.widgets.*;
import org.eclipse.swt.layout.*;
import java.util.*;

public class DisplayEnvironment implements SWTApplication {
  @Override
  public void createContents(Composite parent) {
    parent.setLayout(new FillLayout());
    Text text = new Text(parent, SWT.WRAP | SWT.V_SCROLL);
    for(Map.Entry entry: System.getenv().entrySet()) {
      text.append(entry.getKey() + ": " +
        entry.getValue() + "\n");
    }
  }
  public static void main(String [] args) {
    SWTConsole.run(new DisplayEnvironment(), 800, 600);
  }

} ///:~
