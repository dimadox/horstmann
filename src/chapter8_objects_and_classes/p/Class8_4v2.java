package chapter8_objects_and_classes.p;

public class Class8_4v2 {
    int postIndex;
    String state;
    String city;
    String street;
    int houseNumber;
    int apartmentNumber;

    public Class8_4v2(int postIndex1, String state1, String city1, String street1, int houseNumber1, int apartmentNumber1){
        this(postIndex1, state1, city1, street1, houseNumber1);
        apartmentNumber = apartmentNumber1;
    }

    public Class8_4v2(int postIndex1, String state1, String city1, String street1, int houseNumber1){
        postIndex = postIndex1;
        state = state1;
        city = city1;
        street = street1;
        houseNumber = houseNumber1;
    }

    public String getStreet(){
        String string = street + Integer.toString(apartmentNumber);
        return string;
    }

    public String getCity(){
        String string = state + ", " + city + ", " + Integer.toString(postIndex);
        return string;
    }


    public static void main(String[] args) {
        int postIndex = 123456;
        String state = "Bash";
        String city = "Ufa";
        String street = "Koms";
        int houseNumber = 20;
        int apartmentNumber = 10;

        Class8_4v2 address = new Class8_4v2(postIndex, "Bash", "Ufa", "Koms", 20, 10);
        System.out.println(address.getCity());

        System.out.println("The first string"  + "\nthe second string");




    }








}
