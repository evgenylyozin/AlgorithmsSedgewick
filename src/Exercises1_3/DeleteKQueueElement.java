package Exercises1_3;

import AlgorithmsSedgewick.Queue;

public class DeleteKQueueElement {
    public static void main(String[] args) {
        Queue<Integer> intQueue = new Queue<Integer>();
        intQueue.enqueue(1);
        intQueue.enqueue(2);
        intQueue.enqueue(3);
        intQueue.enqueue(4);
        intQueue.enqueue(5);
        intQueue.enqueue(6);
        System.out.println(intQueue.delete(3));
        System.out.println(intQueue.size());
        System.out.println(intQueue.find(4));
    }
}
