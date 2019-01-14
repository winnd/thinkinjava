package step3_适配器;

import step2_过滤器.BandPassChild;
import step2_过滤器.HighPassImpl;
import step2_过滤器.LowPassImpl;
import step2_过滤器.WaveForm;

/**
 * <p>Title:</p >
 * <p>Description:</p >
 * <p>Copyright:Copyright (c) 2019</p >
 * <p>Company:易泓咨询管理公司 </p >
 * <p>Date:2019.1.10 15:19</p >
 * <p>Modify:2019.1.10 15:19 </p >
 * <p>Bug:</p >
 *
 * @author fengye.ren
 * @version 1.1
 */
public class FilterProcessor_Main {
    public static void main(String[] args) {
        WaveForm waveForm = new WaveForm();
        Apply_Impl.process(new FilterAdaper(new LowPassImpl(1.0)), waveForm);
        Apply_Impl.process(new FilterAdaper(new HighPassImpl(2.0)), waveForm);
        Apply_Impl.process(new FilterAdaper(new BandPassChild(3.0, 4.0)), waveForm);
    }
}

// new LowPassImpl(1.0)                                                     // Filter实例
// new FilterAdaper(new LowPassImpl(1.0))                                   // 转为processor实例
// Apply_Impl.process(new FilterAdaper(new LowPassImpl(1.0)), waveForm)     // processer里对waveform进行操作

// 就是说processor 没用自己的process()用了filter的process()
// Apply_Impl的process是调用Processor的process()

