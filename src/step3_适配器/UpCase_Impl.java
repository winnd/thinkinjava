package step3_适配器;

/**
 * <p>Title:</p >
 * <p>Description:</p >
 * <p>Copyright:Copyright (c) 2019</p >
 * <p>Company:易泓咨询管理公司 </p >
 * <p>Date:2019.1.10 14:13</p >
 * <p>Modify:2019.1.10 14:13 </p >
 * <p>Bug:</p >
 *
 * @author fengye.ren
 * @version 1.1
 */
public class UpCase_Impl extends StringProcessor_abs_Impl {
    @Override public String process(Object input) {
        return input.toString().toUpperCase();
    }
}
