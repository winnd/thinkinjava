package 国际象棋_工厂模式;

/**
 * <p>Title:</p >
 * <p>Description:</p >
 * <p>Copyright:Copyright (c) 2019</p >
 * <p>Company:易泓咨询管理公司 </p >
 * <p>Date:2019.1.11 14:19</p >
 * <p>Modify:2019.1.11 14:19 </p >
 * <p>Bug:</p >
 *
 * @author fengye.ren
 * @version 1.1
 */
public class CkeckersFactory implements GameFactory {
    @Override
    public Game getGame() {
        return new Checkers();
    }
}
