package step1_完全解耦;

/**
 * <p>Title:</p >
 * <p>Description:</p >
 * <p>Copyright:Copyright (c) 2019</p >
 * <p>Company:易泓咨询管理公司 </p >
 * <p>Date:2019.1.10 15:39</p >
 * <p>Modify:2019.1.10 15:39 </p >
 * <p>Bug:</p >
 *
 * @author fengye.ren
 * @version 1.1
 */
public class Upcase_Impl extends Processor {
    @Override String process(Object input) {
        return input.toString().toUpperCase();
    }
}
