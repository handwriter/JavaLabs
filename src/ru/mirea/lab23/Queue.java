package ru.mirea.lab23;

public interface Queue {
    // Pre: element != null & 0 <= i <= queue.size()
    // Post: endInd: queue[endInd] == element
    void enqueue(Object element);

    // Pre: queue.size() > 0 && queue[0] != null
    // Post:
    Object element();

    // Pre: queue.size() > 0 queue[0] != null
    // Post: queue.size() - prevQueue.size() = 1
    Object dequeue();

    // Pre:
    // Post: return queue.endInd - queue.startInd
    int size();

    // Pre:
    // Post:
    boolean isEmpty();

    // Pre:
    // Post: queue.size() == 0
    void clear();
}