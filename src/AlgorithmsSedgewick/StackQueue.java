package AlgorithmsSedgewick;

import java.util.Iterator;

public class StackQueue<Item> implements Iterable<Item>
{
    private Node first;
    private Node last;
    private int N;
    private class Node
    {
        Item item;
        Node next;
    }
    public boolean isEmpty() { return  first == null; }
    public int size() { return N; }

    public void enqueue (Item item)
    {   // Добавление элемента в конец списка
        Node oldlast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if (isEmpty()) first = last;
        else oldlast.next = last;
        N++;
    }
    public Item dequeue()
    {
        // Удаление элемента из начала списка
        Item item = first.item;
        first = first.next;
        if (isEmpty()) last = null;
        N--;
        return item;
    }

    public void push (Item item)
    {   // Добавление элемента на верхушку стекоочереди
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
        N++;
    }

    public Item pop()
    {
        // Удаление элемента с верхушки стекоочереди
        Item item = first.item;
        first = first.next;
        N--;
        return item;
    }

    public Item delete(int k) {
        int counter = 0;
        if (N > k) {
            Node currentNode = first;
            Node beforeNode = null;
            Node nextNode = first.next;
            while (counter != k) {
                beforeNode = currentNode;
                currentNode = nextNode;
                nextNode = currentNode.next;
                counter++;
            }
            beforeNode.next = nextNode;
            N--;
            return currentNode.item;
        }
        return null;
    }

    public boolean find(Item k) {
        Node currentNode = first;
        Node nextNode = first.next;
            while (nextNode != null) {
                if (currentNode.item == k) {
                    return true;
                }
                currentNode = nextNode;
                nextNode = currentNode.next;
            }
        return false;
    }

    public Iterator<Item> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<Item> {
        private Node current = first;
        public boolean hasNext() {
            return current != null;
        }
        public void remove() {}
        public Item next() {
            Item item = current.item;
            current = current.next;
            return item;
        }
    }
}
