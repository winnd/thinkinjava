package step3_适配器;

import java.util.Arrays;

/**
 * <p>Title:</p >
 * <p>Description:</p >
 * <p>Copyright:Copyright (c) 2019</p >
 * <p>Company:易泓咨询管理公司 </p >
 * <p>Date:2019.1.10 14:15</p >
 * <p>Modify:2019.1.10 14:15 </p >
 * <p>Bug:</p >
 *
 * @author fengye.ren
 * @version 1.1
 */
public class Splitter_Impl extends StringProcessor_abs_Impl {
    @Override public Object process(Object input) {
        return Arrays.toString(input.toString().split("  "));
    }
}
