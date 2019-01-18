package 内部类.内部类的上转型;

/**
 * <p>Title:</p >
 * <p>Description:</p >
 * <p>Copyright:Copyright (c) 2019</p >
 * <p>Company:易泓咨询管理公司 </p >
 * <p>Date:2019.1.16 16:44</p >
 * <p>Modify:2019.1.16 16:44 </p >
 * <p>Bug:</p >
 *
 * @author fengye.ren
 * @version 1.1
 * 对程序员隐藏了PDestination 和PContents 方法
 */
public class Parcel4 {
    private class PContents implements Contents{
        private int i = 11;

        @Override
        public int value() {
            return 0;
        }
    }

    protected class PDestination implements Destination {
        private String label;

        private PDestination(String whereTo) {
            label = whereTo;
        }
        @Override
        public String readLabel() {
            return null;
        }
    }

    public Destination destination(String s) {
        return new PDestination(s);
    }

    public Contents contents() {
        return new PContents();
    }
}
