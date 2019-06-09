package chapter1.programmingExercises;
import javax.swing.JOptionPane;

public class Class15 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("What is your name?");
        System.out.println(name);
        JOptionPane.showMessageDialog(null, "Hello, " + name + "!");
    }
}
