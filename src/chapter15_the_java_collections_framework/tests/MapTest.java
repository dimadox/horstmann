package chapter15_the_java_collections_framework.tests;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {



    public static void main(String[] args) {
        Map<String, String> favoriteColors = new HashMap<String, String>();
        favoriteColors.put("Dima", "A");
        favoriteColors.put("Adam", "B");

        Set<String> keySet = favoriteColors.keySet();
        for (String key:keySet){
            String value = favoriteColors.get(key);
            System.out.println(key + " : " + value);
        }

    }


}
