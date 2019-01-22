package ThinkingInJava4th源码code.TIJ4code.typeinfo;//: typeinfo/HiddenImplementation.java
// Sneaking around package access.

import ThinkingInJava4th源码code.TIJ4code.typeinfo.interfacea.*;
import ThinkingInJava4th源码code.TIJ4code.typeinfo.packageaccess.HiddenC;

import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.List;

public class HiddenImplementation {
    public static void main(String[] args) throws Exception {
        A a = HiddenC.makeA();
        a.f();
        System.out.println(a.getClass().getName());
        // Compile error: cannot find symbol 'C':
    /* if(a instanceof C) {
      C c = (C)a;
      c.g();
    } */
        // Oops! Reflection still allows us to call g():
        callHiddenMethod(a, "g");
        // And even methods that are less accessible!
        callHiddenMethod(a, "u");
        callHiddenMethod(a, "v");
        callHiddenMethod(a, "w");
    }

    static void callHiddenMethod(Object a, String methodName) throws Exception {
        Method g = a.getClass().getDeclaredMethod(methodName);
        g.setAccessible(true);
        g.invoke(a);
        List<Object> list = new ArrayList<>();
    }
} /* Output:
public C.f()
typeinfo.packageaccess.C
public C.g()
package C.u()
protected C.v()
private C.w()
*///:~
