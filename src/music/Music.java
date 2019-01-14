package music;

/**
 * <p>Title:</p >
 * <p>Description:</p >
 * <p>Copyright:Copyright (c) 2019</p >
 * <p>Company:易泓咨询管理公司 </p >
 * <p>Date:2019.1.7 10:03</p >
 * <p>Modify:2019.1.7 10:03 </p >
 * <p>Bug:</p >
 *
 * @author fengye.ren
 * @version 1.1
 */

public class Music {
    public static void tune(Instrument instrument) {
        instrument.play(Note.MIDDLE_C);
    }

    public static void main(String[] args) {
        Wind flute = new Wind();
        tune(flute);
    }
}
