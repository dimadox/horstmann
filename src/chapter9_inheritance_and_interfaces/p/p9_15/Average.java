package chapter9_inheritance_and_interfaces.p.p9_15;

public class Average {
    public static double average(Class9_15[] objects){
        if (objects.length == 0) {
            return 0;
        }
        double sum = 0;

        for (Class9_15 obj : objects)
        {
            sum = sum + obj.getHeight();
        }
        return sum / objects.length;
    }
}
