package 接口_策略模式;

/**
 * <p>Title:</p >
 * <p>Description:</p >
 * <p>Copyright:Copyright (c) 2019</p >
 * <p>Company:易泓咨询管理公司 </p >
 * <p>Date:2019.1.10 10:53</p >
 * <p>Modify:2019.1.10 10:53 </p >
 * <p>Bug:</p >
 *
 * @author fengye.ren
 * @version 1.1
 */
public class Apply_main {
    public static void process(ProcessorImp p, Object s) {
        System.out.println("Using Processor " + p.name());
        System.out.println(p.process(s));
    }

    public static String s = "Disagreement with belief is by definition incorrect";

    public static void main(String[] args) {
        process(new Upcase_Impl(), s);
        process(new Downcase_Impl(), s);
        process(new Splitter_Impl(), s);
    }
}
