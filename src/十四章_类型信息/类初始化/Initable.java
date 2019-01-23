package 十四章_类型信息.类初始化;

import 十四章_类型信息.类初始化.ClassInitialization;

public class Initable {
    static final int staticFinal = 47;
    static final int staticFinal2 = ClassInitialization.rand.nextInt(1000);
    static {
        System.out.println("Initializing Initable");
    }
}
