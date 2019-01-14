package 抽象类;

import music.Note;

/**
 * <p>Title:</p >
 * <p>Description:</p >
 * <p>Copyright:Copyright (c) 2019</p >
 * <p>Company:易泓咨询管理公司 </p >
 * <p>Date:2019.1.10 9:18</p >
 * <p>Modify:2019.1.10 9:18 </p >
 * <p>Bug:</p >
 *
 * @author fengye.ren
 * @version 1.1
 */
public class Stringed_Impl extends Instrument_Imp {
    @Override public void play(Note n) {
        System.out.println("Stringed.play()" + n);
    }

    @Override public void adjust() {
        
    }

    public String what() {
        return "Stringed:";
    }
}
