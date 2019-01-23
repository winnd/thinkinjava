package ThinkingInJava4th源码code.TIJ4code.holding;//: holding/StackCollision.java

import ThinkingInJava4th源码code.TIJ4code.net.mindview.util.Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class StackCollision {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        for (String s : "My dog has fleas".split(" "))
            stack.push(s);
        while (!stack.empty())
            System.out.print(stack.pop() + " ");
        System.out.println();
        java.util.Stack<String> stack2 = new java.util.Stack<String>();
        for (String s : "My dog has fleas".split(" "))
            stack2.push(s);
        while (!stack2.empty())
            System.out.print(stack2.pop() + " ");
    }
} /* Output:
fleas has dog My
fleas has dog My
*///:~
