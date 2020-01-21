package chapter18.test;

public class GenericMethod {
    int i=1;






    public static String genMethod(String variable){
        return variable;
    }


    public static <T> T genMethod2(T variable){
        return variable;
    }


    /**
     *
     * @param args
     */



    public static void main(String[] args) {
        System.out.println(genMethod2("agggbc"));
    }






}
