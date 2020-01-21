package chapter8.p;
//import chapter8.p.Geometry;

import java.util.Scanner;

public class Class8_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        System.out.println(Geometry.sphereVolume(radius));
        System.out.println(Geometry.sphereSurface(radius));
    }
}
