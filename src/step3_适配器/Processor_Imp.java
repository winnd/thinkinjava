package step3_适配器;

/**
 * <p>Title:</p >
 * <p>Description:</p >
 * <p>Copyright:Copyright (c) 2019</p >
 * <p>Company:易泓咨询管理公司 </p >
 * <p>Date:2019.1.10 14:07</p >
 * <p>Modify:2019.1.10 14:07 </p >
 * <p>Bug:</p >
 *
 * @author fengye.ren
 * @version 1.1
 */
public interface Processor_Imp {
    String name();

    Object process(Object input);
}
