package ru.mirea.lab_lists_1;

public class StudentsGroup2 {
    private Student2 firstElement;
    private Student2 lastElement;

    public StudentsGroup2() {
    }

    public void addBack(Student2 student) {
        if (firstElement == null) {
            firstElement = student;
            lastElement = student;
        } else {
            firstElement.prev = student;
            firstElement = student;
        }
    }

    public void addFront(Student2 student) {
        if (firstElement == null) {
            firstElement = student;
            lastElement = student;
        } else {
            lastElement.next = student;
            lastElement = student;
        }
    }

    public static StudentsGroup2 createEmpty() {
        return new StudentsGroup2();
    }

    public void removeAt(Integer index) {
        Student2 currElement = firstElement;
        if (index == 0 && currElement != null) {
            if (firstElement == lastElement) {
                firstElement = null;
                lastElement = null;
            } else {
                firstElement.next.prev = null;
                firstElement = firstElement.next;
            }
        } else {
            Student2 prevElement = null;
            Integer i = 0;
            while (currElement != null) {
                if (i == index) {
                    prevElement.next = currElement.next;
                    currElement.next.prev = prevElement;
                    break;
                }
                prevElement = currElement;
                currElement = currElement.next;
                i += 1;
            }
        }
    }

    public String printElem(int index) {
        Student2 currElement = firstElement;
        if (index == 0 && currElement != null) {
            return currElement.toString();
        } else {
            int i = 0;
            while (currElement != null) {
                if (i == index) {
                    return currElement.toString();
                }
                currElement = currElement.next;
                i += 1;
            }
        }
        return "Не найден";
    }

    public void clear() {
        firstElement = null;
    }

    public boolean isEmpty() {
        return firstElement == null;
    }
}
