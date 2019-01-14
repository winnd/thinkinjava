package Scanner类;

import java.util.Random;

/**
 * <p>Title:</p >
 * <p>Description:</p >
 * <p>Copyright:Copyright (c) 2019</p >
 * <p>Company:易泓咨询管理公司 </p >
 * <p>Date:2019.1.11 10:15</p >
 * <p>Modify:2019.1.11 10:15 </p >
 * <p>Bug:</p >
 *
 * @author fengye.ren
 * @version 1.1
 * 本例使用适配器模式
 */
public class RandomDoubles_适配器模式 {
    private static Random random = new Random(47);

    // 适配器
    public double next() {
        return random.nextDouble();
    }

    public static void main(String[] args) {
        RandomDoubles_适配器模式 randomWords_withAdapter = new RandomDoubles_适配器模式();
        for (int i = 0; i < 7; i++) {
            System.out.println(randomWords_withAdapter.next() + " ");
        }
    }
}
