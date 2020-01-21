package chapter15_the_java_collections_framework.tests;

import java.util.HashMap;
import java.util.Map;

public class MapTests {
    public static void main(String[] args) {
        Map<String, Integer> links = new HashMap<String, Integer>();

        //добавление
        links.put("Dima", 28);
        links.put("Xenia", 25);
        links.put("Tim", 20);
        links.put("Alice", 35);
        links.put("Ron", 15);

        //знаение по ключу
        //System.out.println(links.get("Xenia"));

        //проверка есть ли
        //System.out.println(links.containsKey("Dima"));

        //удаление
        //links.remove("Tim");

        //список ключей
        //System.out.println(links.keySet());

        //список значений
//        Collection<Integer> values = links.values();
//        ArrayList<Integer> arrayList = new ArrayList<>(links.values());
//        System.out.println(arrayList);

        //список объектов. В чем отличие?
//        Set entries = links.entrySet();
//        System.out.println(entries);
//        System.out.println(links);

        //for each
//        for (Map.Entry me: links.entrySet()){
//            System.out.println("Key: " + me.getKey() + " and Value: " + me.getValue());
//        }




    }
}