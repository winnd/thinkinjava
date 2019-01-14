package 抽象类;

import music.Note;

/**
 * <p>Title:</p >
 * <p>Description:</p >
 * <p>Copyright:Copyright (c) 2019</p >
 * <p>Company:易泓咨询管理公司 </p >
 * <p>Date:2019.1.10 9:21</p >
 * <p>Modify:2019.1.10 9:21 </p >
 * <p>Bug:</p >
 *
 * @author fengye.ren
 * @version 1.1
 */
public class WoodWind_Wind_Impl extends Wind_Impl {
    public void play(Note n) {
        System.out.println("WoodWind.play()" + n);
    }

    public String what() {
        return "woodwind";
    }
}
