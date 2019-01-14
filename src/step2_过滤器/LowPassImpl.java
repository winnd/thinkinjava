package step2_过滤器;

/**
 * <p>Title:</p >
 * <p>Description:</p >
 * <p>Copyright:Copyright (c) 2019</p >
 * <p>Company:易泓咨询管理公司 </p >
 * <p>Date:2019.1.10 11:11</p >
 * <p>Modify:2019.1.10 11:11 </p >
 * <p>Bug:</p >
 *
 * @author fengye.ren
 * @version 1.1
 */
public class LowPassImpl extends Filter{
    double cutoff;

    public LowPassImpl(double cutoff) {
        this.cutoff = cutoff;
    }

    @Override public WaveForm process(WaveForm input) {
        return input;
    }
}
