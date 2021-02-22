package AlgorithmsSedgewick;

public class Stack<Item> implements Iterable<Item>
{
    private Node first;
    private int N;
    private class Node
    {
        Item item;
        Node next;
    }
    public boolean isEmpty() { return  first == null; }
    public int size() { return N; }
    public void push (Item item)
    {   // Добавление элемента на верхушку стека
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
        N++;
    }
    public Item pop()
    {
        // Удаление элемента с верхушки стека
        Item item = first.item;
        first = first.next;
        N--;
        return item;
    }

    // Итератор
}
