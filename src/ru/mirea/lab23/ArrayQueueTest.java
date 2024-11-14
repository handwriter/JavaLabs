package ru.mirea.lab23;

public class ArrayQueueTest {

    private ArrayQueue queue = new ArrayQueue();;

    public boolean testEnqueueAndSize() {
        if (!queue.isEmpty()) return false;
        queue.enqueue("First");
        queue.enqueue("Second");
        if (queue.size() != 2) return false;
        return !queue.isEmpty();
    }

    public boolean testElement() {
        queue.enqueue("First");
        queue.enqueue("Second");

        Object element = queue.element();
        if (element != "First") return false;
        return queue.size() == 2;
    }

    public boolean testDequeue() {
        queue.enqueue("First");
        queue.enqueue("Second");

        Object dequeuedElement = queue.dequeue();
        if (dequeuedElement != "First") return false;
        if (queue.size() != 1) return false;
        dequeuedElement = queue.dequeue();
        if (dequeuedElement != "Second") return false;
        if (queue.size() != 0) return false;
        return queue.isEmpty();
    }

    public boolean testIsEmpty() {
        if (!queue.isEmpty()) return false;
        queue.enqueue("First");
        if (queue.isEmpty()) return false;
        queue.dequeue();
        return queue.isEmpty();
    }

    public boolean testClear() {
        queue.enqueue("First");
        queue.enqueue("Second");
        if (queue.size() != 2) return false;
        queue.clear();
        if (!queue.isEmpty()) return false;
        if (queue.size() != 0) return false;

        queue.enqueue("Third");
        return 1 == queue.size();
    }

    public boolean testToArray() {
        queue.enqueue("First");
        queue.enqueue("Second");
        queue.enqueue("Third");

        Object[] array = queue.toArray();
        Object[] tmp = new Object[]{"First", "Second", "Third"};
        if (array.length != tmp.length) return false;
        for (int i = 0; i < array.length;i++)
        {
            if (array[i] != tmp[i]) return false;
        }
        return true;
    }
}