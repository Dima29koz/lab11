package tasks;

import java.util.LinkedList;

public class LinkedQueue implements Queue{
    private LinkedList <Object> lst = new LinkedList<Object>();

    @Override
    public void enqueue(Object element) {
        assert element != null;
        lst.add(element);
    }

    @Override
    public Object element() {
        return lst.element();
    }

    @Override
    public Object dequeue() {
        return lst.pop();
    }

    @Override
    public int size() {
        return lst.size();
    }

    @Override
    public boolean isEmpty() {
        return lst.isEmpty();
    }

    @Override
    public void clear() {
        lst.clear();
    }

    @Override
    public String toString() {
        return lst.toString();
    }
}
