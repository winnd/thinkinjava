package music;

/**
 * <p>Title:</p >
 * <p>Description:</p >
 * <p>Copyright:Copyright (c) 2019</p >
 * <p>Company:易泓咨询管理公司 </p >
 * <p>Date:2019.1.7 10:05</p >
 * <p>Modify:2019.1.7 10:05 </p >
 * <p>Bug:</p >
 *
 * @author fengye.ren
 * @version 1.1
 */

public class Wind extends Instrument {
    public void play(Note note) {
        System.out.println("Wind_Impl.play()" + note);
    }
}