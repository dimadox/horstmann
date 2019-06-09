package chapter1.programmingExercises;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Class17 {
    public static void main(String[] args) throws Exception {
        String url = "https://memegenerator.net/img/instances/13328130/int-pi-3141-whats-pi.jpg";
        // String url = "http://horstmann.com/java4everyone/duke.gif";
        URL imageLocation = new URL(url);

    JOptionPane.showMessageDialog(null, "Hello", "Title",
        JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
    }

}
