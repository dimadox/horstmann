package chapter9_inheritance_and_interfaces.tests;

public class Cars {
    public static void main(String[] args) {
        Audi audi;      // в ссылку audi можно будет назначать “ќЋ№ ќ на объекты Audi (или подклассы Audi)
        audi = new Audi();     // o1

        //////////////////////////

        Lada lada = new Lada();     // o2
        Honda honda = new Honda();  // o3

        Object objRef = lada;
        //////////////////////////
        System.out.println(((Lada)objRef).fly());
        //одно и тоже
        Lada ladaRef = (Lada) objRef;
        System.out.println(ladaRef.fly());
    }
}
