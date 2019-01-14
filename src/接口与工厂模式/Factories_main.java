package 接口与工厂模式;

/**
 * <p>Title:</p >
 * <p>Description:</p >
 * <p>Copyright:Copyright (c) 2019</p >
 * <p>Company:易泓咨询管理公司 </p >
 * <p>Date:2019.1.11 14:00</p >
 * <p>Modify:2019.1.11 14:00 </p >
 * <p>Bug:</p >
 *
 * @author fengye.ren
 * @version 1.1
 */
public class Factories_main {
    private static void serviceConsumer(ServiceFactory factory) {
        Service s = factory.getService(); // service是接口
        s.method1();
        s.method2();
    }

    public static void main(String[] args) {
        serviceConsumer(new Implementation1Facotry());
        serviceConsumer(new Implementation2Factory());
    }
}

//在工厂内部new一个新对象并调用该新对象的方法
//可能是用来屏蔽返回值(不用指定Service的确切类型)