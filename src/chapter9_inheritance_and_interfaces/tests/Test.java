package chapter9_inheritance_and_interfaces.tests;

public class Test {
    public static void main(String[] args) {
        new Audi();
        (new Audi()).drive();
        Audi a; //ссылка типа Audi, как например int a
        a = new Audi();


        //объект, на который ссылается ссылка типа Audi является либо объектом
        // класса Audi, либо отдним из его подклассов, например Audi one = new Q8()

        Audi one = new Audi(); //Тип Audi берет методы, котрые есть в классе Audi

        //объект, на который ссылается ссылка типа Car является либо объектом
        // класса Car, либо отдним из его подклассов: Car, Audi, Honda, Lamba, Q8

        Car two = new Audi(); //Тип Car берет методы, котрые есть в классе Car. Любой класс это тип











    }
}

