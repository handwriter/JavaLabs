package ru.mirea.lab_lists_1;

public class StudentsGroup {
    private Student firstElement;

    public StudentsGroup() {
    }

    public void add(Student student) {
        if (firstElement == null) {
            firstElement = student;
        } else {
            firstElement.setNext(student);
        }
    }

    public static StudentsGroup createEmpty() {
        return new StudentsGroup();
    }

    public void removeAt(Integer index) {
        Student currElement = firstElement;
        if (index == 0 && currElement != null) {
            firstElement = currElement.next;
        } else {
            Student prevElement = null;
            Integer i = 0;
            while (currElement != null) {
                if (i == index) {
                    prevElement.next = currElement.next;
                    break;
                }
                prevElement = currElement;
                currElement = currElement.next;
                i += 1;
            }
        }
    }

    public String printElem(int index) {
        Student currElement = firstElement;
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
