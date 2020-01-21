package chapter10_graphical_user_interfaces.test;

import javax.swing.*;

public class SubChapter10_1 {
    public static void main(String[] args) {
        final int FRAME_WIDTH = 300;
        final int FRAME_HEIGHT = 400;

        JFrame frame = new JFrame();
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setTitle("This is title");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }


}
