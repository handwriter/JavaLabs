package ru.mirea.lab23;

public class ArrayQueue {
    private Object[] elements = new Object[2];
    private int start = 0, end = 0;

    public void enqueue(Object element) {
        if ((end + 1) % elements.length == start) {
            Object[] tmp = new Object[elements.length * 2];
            System.arraycopy(toArray(), 0, tmp, 0, size());
            elements = tmp;
            start = 0;
            end = elements.length / 2 - 1;
        }
        elements[end] = element;
        end = (end + 1) % elements.length;
    }

    public Object element() {
        return elements[start];
    }

    public Object dequeue() {
        Object tmp = elements[start];
        elements[start] = null;
        start = (start + 1) % elements.length;
        return tmp;
    }

    public int size() {
        if (end >= start) {
            return end - start;
        }
        return elements.length - start + end;
    }

    public boolean isEmpty() {
        return end == start;
    }

    public void clear() {
        elements = new Object[elements.length];
        start = 0;
        end = 0;
    }

    public Object[] toArray() {
        Object[] tmp = new Object[size()];
        if (start <= end) {
            System.arraycopy(elements, start, tmp, 0, end - start);
        } else {
            System.arraycopy(elements, start, tmp, 0, elements.length - start);
            System.arraycopy(elements, 0, tmp, elements.length - start, end);
        }
        return tmp;
    }
}