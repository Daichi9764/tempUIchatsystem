package prog_avancee.UI;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class FrameTool {

    public static void initialize(JFrame f) {
        f.setTitle("MainFrame");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500, 500);
        f.setVisible(true);

    }

    public static void changePanel(JFrame frame, JPanel destPanel) {
        frame.getContentPane().removeAll();
        frame.add(destPanel);
        // reloaod frame
        frame.invalidate();
        frame.repaint();
        frame.setVisible(true);
    }

        public static void reloadFrame(JFrame frame) {
        frame.invalidate();
        frame.repaint();
        frame.setVisible(true);
    }
    
    public static void printStringToPane(JFrame frame, JPanel pane, String txt){
        JLabel lab = new JLabel(txt);
        pane.add(lab);
        FrameTool.reloadFrame(frame);
    }

    

}
