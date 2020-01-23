package chapter6_arrays_and_array_lists.test;

import java.util.ArrayList;

public class arrayListsString {
    public static void main(String[] args) {
        ArrayList<String> friends = new ArrayList<String>(); //объявление
        friends.add("Dima");                                    //добавление
        String name = friends.get(0);                           //получение
        friends.set(0, "Qwe");
        name = friends.get(0);                                  //установить значение
        friends.add("Matt");



        //System.out.println(name);
        int razmer = friends.size();                            // friends.size() - размер
        friends.remove(0);
        System.out.println(friends);




    }


}
