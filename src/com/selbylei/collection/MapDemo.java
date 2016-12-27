package com.selbylei.collection;

import java.util.*;

/**
 * Created by selbylei on 16/12/27.
 */
public class MapDemo {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("k1", "jikexueyuan1");
        map.put("k2", "jikexueyuan2");
        map.put("k3", "jikexueyuan3");
        map.put("k4", "jikexueyuan4");
        map.put("k5", "jikexueyuan5");

//        String key = "k5";
//        if (map.containsKey(key)) {
//            System.out.println(map.get(key));
//        } else {
//            System.out.println(key + "不存在");
//        }
//
//        //map遍历获取所有键
//        Set<String> set = map.keySet();
//        Iterator<String> iterator = set.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//        //map遍历获取所有值
//        Collection<String> collection = map.values();
//        Iterator<String> iterator1 = collection.iterator();
//        while (iterator1.hasNext()){
//            System.out.println(iterator1.next());
//        }
         //map遍历获取键，值
         Set<Map.Entry<String, String>> set =  map.entrySet();
         for (Map.Entry<String,String> m:set){
             System.out.println("键："+m.getKey()+"||值:"+m.getValue());
         }
    }
}
