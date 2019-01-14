package step3_适配器;

import step2_过滤器.Filter;
import step2_过滤器.WaveForm;

/**
 * <p>Title:</p >
 * <p>Description:</p >
 * <p>Copyright:Copyright (c) 2019</p >
 * <p>Company:易泓咨询管理公司 </p >
 * <p>Date:2019.1.10 14:29</p >
 * <p>Modify:2019.1.10 14:29 </p >
 * <p>Bug:</p >
 *
 * @author fengye.ren
 * @version 1.1
 * 代理 取用Filter里的方法
 */
public class FilterAdaper implements Processor_Imp {
    Filter filter;

    public FilterAdaper(Filter filter) {
        this.filter = filter;
    }

    @Override public String name() {
        return filter.name();
    }

    @Override public Object process(Object input) {
        return filter.process((WaveForm) input);
    }
}
