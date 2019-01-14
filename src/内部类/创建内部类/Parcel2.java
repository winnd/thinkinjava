package 内部类.创建内部类;

/**
 * <p>Title:</p >
 * <p>Description:</p >
 * <p>Copyright:Copyright (c) 2019</p >
 * <p>Company:易泓咨询管理公司 </p >
 * <p>Date:2019.1.11 17:05</p >
 * <p>Modify:2019.1.11 17:05 </p >
 * <p>Bug:</p >
 *
 * @author fengye.ren
 * @version 1.1
 * 外部类将有一个方法 改方法返回一个指向内部类的引用
 */
public class Parcel2 {
    class Contents{
        private int i = 11;

        public int value() {
            return i;
        }
    }
    
    class Destination{
        private String label;

        Destination(String whereTo) {
            label = whereTo;
        }

        String readLabel() {
            return label;
        }
    }

    public Destination to(String s) {
        return new Destination(s);
    }

    public Contents contents() {
        return new Contents();
    }

    public void ship(String dest) {
        Contents c = contents();
        Destination d = to(dest);
        System.out.println(d.readLabel());
    }

    public static void main(String[] args) {
        Parcel2 p = new Parcel2();
        p.ship("Tasmania");
        Parcel2 q = new Parcel2();
        Parcel2.Contents c = q.contents();
        Parcel2.Destination d = q.to("Borneo");
    }
}
