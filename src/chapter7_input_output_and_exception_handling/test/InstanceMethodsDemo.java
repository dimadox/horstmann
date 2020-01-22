package chapter7_input_output_and_exception_handling.test;

public class InstanceMethodsDemo {
    public static void main(String[] args) {
        String s1 = "hello, my name is Kumar";
        String s2 = "ola, eu chamo Carlos";

        // s1 is an instance of class String
        // s2 is an instance of class String

        // s1.charAt(0)
        // по сути дела:
        // у метода charAt есть помимо (€вного) аргумента 0
        // ещЄ один (не€вный / implicit) аргумент s1

        // instanceName.methodName(arg1);

        System.out.println(s1.charAt(0));
        System.out.println(s2.charAt(0));



        // data types (classes)
        //   class methods (методы класса) = static methods
        //      Math.cos(1);        // Math - класс
        //   instance methods (методы экземпл€ров) = (non-static) methods
        //      s1.charAt(0);
        //      // charAt(0) ?????
        //      scanner.nextInt(); // считывает объект scanner

        System.out.println(s1.substring(1, 2));
        System.out.println(String.join(" ", new String[] {"1", "2", "50"}));

    }
}
