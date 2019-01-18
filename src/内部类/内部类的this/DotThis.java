package 内部类.内部类的this;

/**
 * <p>Title:</p >
 * <p>Description:</p >
 * <p>Copyright:Copyright (c) 2019</p >
 * <p>Company:易泓咨询管理公司 </p >
 * <p>Date:2019.1.14 9:55</p >
 * <p>Modify:2019.1.14 9:55 </p >
 * <p>Bug:</p >
 *
 * @author fengye.ren
 * @version 1.1
 * 这里的DotThis.this只指class的this 不指方法的this
 */
//: innerclasses/DotThis.java
// Qualifying access to the outer-class object.

public class DotThis {
    void f() { System.out.println("DotThis.f()"); }
    public class Inner {
        public DotThis outer() {
            return DotThis.this;
            // A plain "this" would be Inner's "this"
        }
    }
    public Inner inner() { return new Inner(); }
    public static void main(String[] args) {
        DotThis dt = new DotThis();
        DotThis.Inner dti = dt.inner();
        dti.outer().f();
    }
} /* Output:
DotThis.f()
*///:~

