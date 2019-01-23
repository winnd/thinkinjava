package 十四章_类型信息.Class对象;

public class ToyTest {
    static void printInfo(Class cc) {
        System.out.println("Class name: " + cc.getName() + "is interface?[" + cc.isInterface() + "]");
        System.out.println("Simple name:" + cc.getSimpleName());
        System.out.println("Canonical name:"+cc.getCanonicalName());
    }

    public static void main(String[] args) {
        Class c = null;
        try {
            c = Class.forName("com.company.Class对象.FancyToy");
        } catch (ClassNotFoundException e) {
            System.out.println("cant find FancyToy");
            System.exit(1);
        }
        printInfo(c);
        for (Class face: c.getInterfaces())
            printInfo(face);

        Class up = c.getSuperclass();

        Object object = null;
        Object obj = null;

        try {
            object = up.newInstance(); // 获取一个虚拟实例 up是superClass 没办法直接new
        } catch (InstantiationException e) {
            System.out.println("cannot instantiate");
            System.exit(1);
        } catch (IllegalAccessException e) {
            System.out.println("Cannot access");
            System.exit(1);
        }
        printInfo(object.getClass());
    }
}
