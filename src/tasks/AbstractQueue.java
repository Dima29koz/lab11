package tasks;

import java.util.LinkedList;

public abstract class AbstractQueue implements Queue{
    private LinkedList<Object> lst;

    @Override
    public Object element() {
        return lst.element();
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
}
