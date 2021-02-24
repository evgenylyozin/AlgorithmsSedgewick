package Exercises1_3;

import AlgorithmsSedgewick.Stack;

public class CopyStack {
    public static void main(String[] args) {
        Stack<String> oldStack = new Stack<String>();
        oldStack.push("First");
        oldStack.push("Second");
        oldStack.push("Third");
        System.out.println(oldStack.peek());

        System.out.println(copyStackOfStrings(oldStack));
    }
    public static Stack<String> copyStackOfStrings(Stack<String> oldStack) {
        Stack<String> newStackReverse = new Stack<String>();
        Stack<String> newStack = new Stack<String>();
        for (String s : oldStack) {
            newStackReverse.push(s);
        }
        for (String s : newStackReverse) {
            newStack.push(s);
        }
        return newStack;
    }
}
