package ThinkingInJava4th源码code.TIJ4code.swt;//: swt/HelloSWT.java
// {Requires: org.eclipse.swt.widgets.Display; You must
// install the SWT library from http://www.eclipse.org }

import jdk.nashorn.tools.Shell;

public class HelloSWT {
  public static void main(String [] args) {
    Display display = new StartEnd.Display();
    Shell shell = new Shell(display);
    shell.setText("Hi there, SWT!"); // Title bar
    shell.open();
    while(!shell.isDisposed())
      if(!display.readAndDispatch())
        display.sleep();
    display.dispose();
  }
} ///:~
