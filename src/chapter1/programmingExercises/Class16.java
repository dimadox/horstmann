package chapter1.programmingExercises;
import javax.swing.JOptionPane;

public class Class16 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("What is your name?");
        // System.out.println(name);
        JOptionPane.showInputDialog("My name is Hal! What would you like me to do?");
        // JOptionPane.showMessageDialog(null, "Hello, " + name + "!");
        String msg = "I'm sorry," + name + ". I'm afraid I can't do that";
        JOptionPane.showMessageDialog(null, msg);
    }
}
