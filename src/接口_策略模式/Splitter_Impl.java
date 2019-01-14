package 接口_策略模式;

import java.util.Arrays;

/**
 * <p>Title:</p >
 * <p>Description:</p >
 * <p>Copyright:Copyright (c) 2019</p >
 * <p>Company:易泓咨询管理公司 </p >
 * <p>Date:2019.1.10 10:51</p >
 * <p>Modify:2019.1.10 10:51 </p >
 * <p>Bug:</p >
 *
 * @author fengye.ren
 * @version 1.1
 */
public class Splitter_Impl extends ProcessorImp {
    @Override Object process(Object input) {
        return Arrays.toString(input.toString().split("  "));
    }
}
