package step3_适配器;

/**
 * <p>Title:</p >
 * <p>Description:</p >
 * <p>Copyright:Copyright (c) 2019</p >
 * <p>Company:易泓咨询管理公司 </p >
 * <p>Date:2019.1.10 14:09</p >
 * <p>Modify:2019.1.10 14:09 </p >
 * <p>Bug:</p >
 *
 * @author fengye.ren
 * @version 1.1
 */
public abstract class StringProcessor_abs_Impl implements Processor_Imp {
    @Override public String name() {
        return getClass().getSimpleName();
    }

    public abstract Object process(Object input);

    public static String s = "If she weight the same as a duck, she's made of wood";

    public static void main(String[] args) {
        Apply_Impl.process(new UpCase_Impl(), s);
        Apply_Impl.process(new DownCase_Impl(), s);
        Apply_Impl.process(new Splitter_Impl(), s);
    }
}
