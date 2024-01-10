package prog_avancee.UI;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame();
                FrameTool.initialize(frame);
                frame.getContentPane().add(new UsernameChoicePanel(frame));

            }
        });
    }
}
