package 抽象类;

import music.Note;

/**
 * <p>Title:</p >
 * <p>Description:</p >
 * <p>Copyright:Copyright (c) 2019</p >
 * <p>Company:易泓咨询管理公司 </p >
 * <p>Date:2019.1.10 9:20</p >
 * <p>Modify:2019.1.10 9:20 </p >
 * <p>Bug:</p >
 *
 * @author fengye.ren
 * @version 1.1
 */
public class Brass_Wind_Impl extends Wind_Impl {
    public void play(Note n) {
        System.out.println("Brass.play()" + n);
    }

    public void adjust() {
        System.out.println("Brass.adjust()");
    }
}
