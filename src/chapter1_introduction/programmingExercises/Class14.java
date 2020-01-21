package chapter1_introduction.programmingExercises;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class Class14 {
    public static <string> void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Hello! What is your name? Type in console");
        Scanner s = new Scanner(System.in);
        java.lang.String a=s.nextLine();
        JOptionPane.showMessageDialog(null, "Hello, " + a + "!");

    }
}
