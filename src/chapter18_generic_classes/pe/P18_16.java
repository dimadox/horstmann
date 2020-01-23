package chapter18_generic_classes.pe;

import java.util.List;

// public abstract class P18_16<T extends Number & Measurable> implements Measurable, Runnable

public class P18_16 <S extends Measurable> {
    // instance (non-static) variable
    // obj1.getMeasure()
    S maxValue;

    // class method = static method
    // P18_16.getLargestElement(...)
    // Math.cos(..)

    // ��� ����� ���� �� ��������?
    // LinkedList, ...

    // program to interface (Measurable) not implementation (Car, Human)
    static <T extends Measurable> T getLargestElement(List<T> arraylists) {

        // cannot instantiate a generic!
        //T myObj;
        //myObj = new T();

        T maxValue = arraylists.get(0);
        for (T obj: arraylists) {
            if (obj.getMeasure() > maxValue.getMeasure()){
                maxValue = obj;
            }
        }

        //��� �� ���� �� ���������� � ������� ������������
        return maxValue;
    };
}

