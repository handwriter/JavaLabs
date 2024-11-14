package ru.mirea.lab23;

public class ArrayQueueADTTest {
    private ArrayQueueADT queue = new ArrayQueueADT();;

    public boolean testEnqueueAndSize() {
        if (!ArrayQueueADT.isEmpty(queue)) return false;
        ArrayQueueADT.enqueue(queue,"First");
        ArrayQueueADT.enqueue(queue,"Second");
        if (ArrayQueueADT.size(queue) != 2) return false;
        return !ArrayQueueADT.isEmpty(queue);
    }

    public boolean testElement() {
        ArrayQueueADT.enqueue(queue,"First");
        ArrayQueueADT.enqueue(queue,"Second");
        Object element = ArrayQueueADT.element(queue);
        if (element != "First") return false;
        return ArrayQueueADT.size(queue) == 2;
    }

    public boolean testDequeue() {
        ArrayQueueADT.enqueue(queue,"First");
        ArrayQueueADT.enqueue(queue,"Second");
        Object dequeuedElement = ArrayQueueADT.dequeue(queue);
        if (dequeuedElement != "First") return false;
        if (ArrayQueueADT.size(queue) != 1) return false;
        dequeuedElement = ArrayQueueADT.dequeue(queue);
        if (dequeuedElement != "Second") return false;
        if (ArrayQueueADT.size(queue) != 0) return false;
        return ArrayQueueADT.isEmpty(queue);
    }

    public boolean testIsEmpty() {
        if (!ArrayQueueADT.isEmpty(queue)) return false;
        ArrayQueueADT.enqueue(queue,"First");
        if (ArrayQueueADT.isEmpty(queue)) return false;
        ArrayQueueADT.dequeue(queue);
        return ArrayQueueADT.isEmpty(queue);
    }

    public boolean testClear() {
        ArrayQueueADT.enqueue(queue,"First");
        ArrayQueueADT.enqueue(queue,"Second");
        if (ArrayQueueADT.size(queue) != 2) return false;
        ArrayQueueADT.clear(queue);
        if (!ArrayQueueADT.isEmpty(queue)) return false;
        if (ArrayQueueADT.size(queue) != 0) return false;

        ArrayQueueADT.enqueue(queue,"Third");
        return 1 == ArrayQueueADT.size(queue);
    }

    public boolean testToArray() {
        ArrayQueueADT.enqueue(queue,"First");
        ArrayQueueADT.enqueue(queue,"Second");
        ArrayQueueADT.enqueue(queue,"Third");
        Object[] array = ArrayQueueADT.toArray(queue);
        Object[] tmp = new Object[]{"First", "Second", "Third"};
        if (array.length != tmp.length) return false;
        for (int i = 0; i < array.length;i++)
        {
            if (array[i] != tmp[i]) return false;
        }
        return true;
    }
}
