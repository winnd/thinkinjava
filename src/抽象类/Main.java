package 抽象类;

import music.Note;

/**
 * <p>Title:</p >
 * <p>Description:</p >
 * <p>Copyright:Copyright (c) 2019</p >
 * <p>Company:易泓咨询管理公司 </p >
 * <p>Date:2019.1.10 9:22</p >
 * <p>Modify:2019.1.10 9:22 </p >
 * <p>Bug:</p >
 *
 * @author fengye.ren
 * @version 1.1
 */
public class Main {
    static void tune(Instrument_Imp i) {
        i.play(Note.MIDDLE_C);
    }

    static void tuneAll(Instrument_Imp[] e) {
        for (Instrument_Imp i :e) {
            tune(i);
        }
    }

    public static void main(String[] args) {
        Instrument_Imp[] orchestra = {
                new Wind_Impl(),
                new Percussion_Impl(),
                new Stringed_Impl(),
                new Brass_Wind_Impl(),
                new WoodWind_Wind_Impl()
        };
        tuneAll(orchestra);
    }
}
