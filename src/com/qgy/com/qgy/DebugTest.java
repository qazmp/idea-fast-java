package com.qgy.com.qgy;

import java.util.HashMap;

/**
 * @author qgy
 * @create 2019/3/24 - 16:24
 */
public class DebugTest {


    public static void main(String[] args) {
        HashMap<String, String> stringStringHashMap = new HashMap<>();
        stringStringHashMap.put("name", "kinny");
        stringStringHashMap.put("age", "43");
        String name = stringStringHashMap.get("name");
        System.out.println("name = " + name);
        stringStringHashMap.remove("name");
    }


}
