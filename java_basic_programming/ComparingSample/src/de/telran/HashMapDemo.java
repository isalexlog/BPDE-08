package de.telran;

import java.util.*;


public class HashMapDemo {

    public static List<String> VOC = Arrays.asList("abc", "abd", "bdf", "bbb", "eop");

    public static Map<String, List<String>> vocMap = new HashMap<>();

    private Map<String, List<String>> voc;

    public static void main(String[] args) {
        vocMap = createVocMap(VOC);
        List<String> words = getNameByFirstCharacter("a");
        List<String> words1 = getNameByFirstCharacter("e");
        System.out.println(words);
        System.out.println(words1);

        System.out.println("___________________________________________________");

        List<String> VOC1 = Arrays.asList("abc", "abd", "bdf", "bbb", "eop");
        HashMapDemo hsd = new HashMapDemo(VOC1);
        List<String> res1 = hsd.getNameByFirstCharacter("a");
        System.out.println(res1);
        List<String> res2 = hsd.getNameByFirstCharacter("b");
        System.out.println(res2);
        List<String> res3 = hsd.getNameByFirstCharacter("o");
        System.out.println(res3);

    }

    public HashMapDemo(List<String> voc){
        this.voc = createVocMap(voc);
    }

    public static Map<String, List<String>> createVocMap(List<String> list){
        Map<String, List<String>> map = new HashMap<>();
        for(String s : list) {
            List<String> val = map.get(s.substring(0,1));
            if(val != null) {
                val.add(s);
            } else {
                ArrayList<String> objects = new ArrayList<>();
                objects.add(s);
                map.put(s.substring(0,1), objects);
            }
        } return map;
    }
    public static List<String> getNameByFirstCharacter(String firstCharactr){
        //return vocMap.get(firstCharactr);
        return this.voc.get(firstCharactr);

    }
}
