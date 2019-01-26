package step1_完全解耦;

import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Random;
import java.util.RandomAccess;

/**
 * <p>Title:</p >
 * <p>Description:</p >
 * <p>Copyright:Copyright (c) 2019</p >
 * <p>Company:易泓咨询管理公司 </p >
 * <p>Date:2019.1.10 15:43</p >
 * <p>Modify:2019.1.10 15:43 </p >
 * <p>Bug:</p >
 *
 * @author fengye.ren
 * @version 1.1
 */
public class Splitter_Impl extends Processor {
    @Override String process(Object input) {
        return Arrays.toString(input.toString().split(" "));
    }
}
