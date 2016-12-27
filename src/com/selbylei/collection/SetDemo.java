package com.selbylei.collection;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by selbylei on 16/12/27.
 */
public class SetDemo {
    public static void main(String[] args) {
        Set<String> s = null;
        s=new HashSet<String>();
        s.add("A");
        s.add("B");
        s.add("C");
        s.add("D");
        s.add("E");
        s.add("F");
        System.out.println(s);
    }
}
