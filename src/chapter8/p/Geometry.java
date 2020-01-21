package chapter8.p;

public class Geometry {
    /**
     * ��������� ������� �����
     * @param r ������
     * @return ������� �����
     */
    public static double sphereVolume(double r){
        double sphereVolume = (4* Math.PI * Math.pow(r, 3))/3;
        return sphereVolume;
    }

    public static double sphereSurface(double r){
        double sphereSurface = 4 * Math.PI * Math.pow(r, 2);
        return sphereSurface;
    }

}
