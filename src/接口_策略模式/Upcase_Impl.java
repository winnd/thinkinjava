package 接口_策略模式;

/**
 * <p>Title:</p >
 * <p>Description:</p >
 * <p>Copyright:Copyright (c) 2019</p >
 * <p>Company:易泓咨询管理公司 </p >
 * <p>Date:2019.1.10 10:40</p >
 * <p>Modify:2019.1.10 10:40 </p >
 * <p>Bug:</p >
 *
 * @author fengye.ren
 * @version 1.1
 */
public class Upcase_Impl extends ProcessorImp{
    @Override Object process(Object input) {
        return input.toString().toUpperCase();      // 原来是((String)input).toUpperCase()
    }
}
