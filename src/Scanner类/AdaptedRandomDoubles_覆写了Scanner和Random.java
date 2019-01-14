package Scanner类;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Scanner;

/**
 * <p>Title:</p >
 * <p>Description:</p >
 * <p>Copyright:Copyright (c) 2019</p >
 * <p>Company:易泓咨询管理公司 </p >
 * <p>Date:2019.1.11 10:31</p >
 * <p>Modify:2019.1.11 10:31 </p >
 * <p>Bug:</p >
 *
 * @author fengye.ren
 * @version 1.1
 * 
 */
public class AdaptedRandomDoubles_覆写了Scanner和Random extends RandomDoubles_适配器模式 implements Readable {
    private int count;

    public AdaptedRandomDoubles_覆写了Scanner和Random(int count) {
        this.count = count;
    }

    @Override public int read(CharBuffer cb) throws IOException {   // 这是implement的 覆写了Scanner的read方法
        if (count-- == 0) {
            return -1;
        }
        String result = Double.toString(next()) + " ";          // 这里的next是extend的 改造了Random的next方法(适配
        cb.append(result);
        return result.length();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(new AdaptedRandomDoubles_覆写了Scanner和Random(7));
        while (s.hasNextDouble()) {
            System.out.println(s.nextDouble() + " ");
        }
    }
}
