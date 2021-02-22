package AlgorithmsSedgewick;

import java.util.Iterator;

public class Queue<Item> implements Iterable<Item>
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
