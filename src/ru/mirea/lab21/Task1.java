package ru.mirea.lab21;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task1 {
    public static <E> ArrayList<E> ArrayToArrayList(E[] a) {
        ArrayList<E> lst = new ArrayList<E>();
        for (E e : a) lst.add(e);
        return lst;
    }


    public static void main(String [] args){
        String [] str = {"10","-2","0","0","1"};
        Integer [] str2 = {1, 2, 3, 4};
        var dt1 = ArrayToArrayList(str);
        var dt2 = ArrayToArrayList(str2);
    }
}
