package chapter18_generic_classes.test;

import java.util.ArrayList;

public class MinHelper {

    public static ComparableIntObject simpleMin(ArrayList<ComparableIntObject> lst) {
        ComparableIntObject smallest = lst.get(0);
        for (int i = 1; i < lst.size(); i++){
            ComparableIntObject obj = lst.get(i);
            if (obj.compareToOther(smallest) < 0){
                smallest = obj;
            }
        }

        return smallest;
    }

    public static ComparableDoubleObject simpleMin2(ArrayList<ComparableDoubleObject> lst) {
        ComparableDoubleObject smallest = lst.get(0);
        for (int i = 1; i < lst.size(); i++){
            ComparableDoubleObject obj = lst.get(i);
            if (obj.compareToOther(smallest) < 0){
                smallest = obj;
            }
        }

        return smallest;
    }

    public static void main(String[] args) {
        ArrayList<ComparableIntObject> l1 =
                new ArrayList<>();

        l1.add(new ComparableIntObject(10));
        l1.add(new ComparableIntObject(-5));
        l1.add(new ComparableIntObject(-1500));
        l1.add(new ComparableIntObject(25));
        l1.add(new ComparableIntObject(-105));

        ComparableIntObject smallest = simpleMin(l1);
        System.out.println(smallest);



        ArrayList<ComparableDoubleObject> l2 =
                new ArrayList<>();

        l2.add(new ComparableDoubleObject(10));
        l2.add(new ComparableDoubleObject(-5));
        l2.add(new ComparableDoubleObject(-1500));
        l2.add(new ComparableDoubleObject(25));
        l2.add(new ComparableDoubleObject(-105));

        ComparableDoubleObject smallest2 = simpleMin2(l2);
        System.out.println(smallest2);
    }
}
