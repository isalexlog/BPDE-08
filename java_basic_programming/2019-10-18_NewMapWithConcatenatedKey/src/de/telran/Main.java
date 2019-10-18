package de.telran;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("a", "Hi");
        map.put("b", "There");

        Map<String, String> newMap = mapWithConcatenatedKeysAndValues(map);
        System.out.println(newMap);
    }

    public static Map<String, String> mapWithConcatenatedKeysAndValues(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            String newKey = "a" + "b";
            String newValue = map.get("a") + map.get("b");
            map.put(newKey, newValue);
        }
        return map;
    }
}
