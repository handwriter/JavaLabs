package ru.mirea.lab23;

public class ArrayQueueADT {
    private Object[] elements = new Object[2];
    private int start = 0, end = 0;

    static public void enqueue(ArrayQueueADT queue, Object element) {
        if ((queue.end + 1) % queue.elements.length == queue.start) {
            Object[] tmp = new Object[queue.elements.length * 2];
            System.arraycopy(toArray(queue), 0, tmp, 0, size(queue));
            queue.elements = tmp;
            queue.start = 0;
            queue.end = queue.elements.length / 2 - 1;
        }
        queue.elements[queue.end] = element;
        queue.end = (queue.end + 1) % queue.elements.length;
    }

    static public Object element(ArrayQueueADT queue)
    {
        return queue.elements[queue.start];
    }

    static public Object dequeue(ArrayQueueADT queue) {
        Object tmp = queue.elements[queue.start];
        queue.elements[queue.start] = null;
        queue.start = (queue.start + 1) % queue.elements.length;
        return tmp;
    }

    static public int size(ArrayQueueADT queue) {
        if (queue.end >= queue.start) {
            return queue.end - queue.start;
        }
        return queue.elements.length - queue.start + queue.end;
    }

    static public boolean isEmpty(ArrayQueueADT queue)
    {
        return queue.end == queue.start;
    }

    static public void clear(ArrayQueueADT queue) {
        queue.elements = new Object[queue.elements.length];
        queue.start = 0;
        queue.end = 0;
    }

    static public Object[] toArray(ArrayQueueADT queue) {
        Object[] tmp = new Object[size(queue)];
        if (queue.start <= queue.end) {
            System.arraycopy(queue.elements, queue.start, tmp, 0, queue.end - queue.start);
        } else {
            System.arraycopy(queue.elements, queue.start, tmp, 0, queue.elements.length - queue.start);
            System.arraycopy(queue.elements, 0, tmp, queue.elements.length - queue.start, queue.end);
        }
        return tmp;
    }
}