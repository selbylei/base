package com.selbylei.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by selbylei on 16/12/27.
 * 迭代接口
 */
public class IteratorDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            if ("A".equals(next)) {
                iterator.remove();
            } else {
                System.out.println(next);
            }
        }
    }
}
