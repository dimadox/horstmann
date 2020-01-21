package chapter9_inheritance_and_interfaces.p.p9_15;

public class Class9_15 {                    //גלוסעמ Person

    String name;
    double height;

    public Class9_15(String name, double height){
        this.name = name;
        this.height = height;
    }

    public double getHeight(){
        return height;
    }



    public static void main(String[] args) {
        Class9_15 [] names = new Class9_15[3];
        names[0] = new Class9_15("Dima", 15);
        names[1] = new Class9_15("Tim", 30);
        names[2] = new Class9_15("Tom", 75);

        System.out.println("Average is " + Average.average(names));

    }
}
