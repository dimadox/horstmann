package chapter9_inheritance_and_interfaces.tests;

public class ReturnObject {

    public static Audi getAudiObject() {
        Audi temp = new Audi();
        return temp;
    }

    // a(mutateAudi) = audi(main)
    public static void mutateAudi(Audi a) {
        a = new Audi();
        a.setI(200);
    }



    public static int honda(Audi aud){
        aud.getI();
        int i = 0;
        return i;
    }


    public static void main(String[] args) {
        Audi a = getAudiObject();
        a.drive();

        int x;
        // ...
        Object objRef;

        objRef = null;

        // honda(objRef);
        honda(a);

        Audi audi = new Audi();

        int fuel = honda(audi);

        mutateAudi(audi);

        audi.audiHello();

    }
}
