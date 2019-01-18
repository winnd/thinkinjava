//: net/mindview/util/DaemonThreadFactory.java
package ThinkingInJava4th源码code.TIJ4code.net.mindview.util;
import java.util.concurrent.*;

public class DaemonThreadFactory implements ThreadFactory {
  public Thread newThread(Runnable r) {
    Thread t = new Thread(r);
    t.setDaemon(true);
    return t;
  }
} ///:~
