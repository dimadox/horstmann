package chapter20_multithreading.test;

public class Car{
    private int path = 0;

    public void forward(){
        path = path + 1;
        System.out.println("Path forward = " + path);
    }

    public void back(){
        path = path - 1;
        System.out.println("Path back = " + path);
    }
}