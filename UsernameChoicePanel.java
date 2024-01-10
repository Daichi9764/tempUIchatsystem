package prog_avancee.UI;

import java.awt.Dimension;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;

import javax.swing.*;

import prog_avancee.Controller.Controller;

public class UsernameChoicePanel extends JPanel {
    protected JTextField UsernameField;
    protected JLabel UsernameLabel;
    protected JButton OKButton;
    // Controller ctrler;


    public UsernameChoicePanel(JFrame originalFrame) {
        UsernameField = new JTextField(5);
        UsernameLabel = new JLabel("enter username");
        OKButton = new JButton("OK");

        // try {
        //     ctrler = Controller.getInstance();
        // } catch (Exception e) {
        //     // TODO Auto-generated catch block
        //     e.printStackTrace();
        // }

        setSize(500,500);
    
        add(UsernameLabel);
        add(UsernameField);
        add(OKButton);

        OKButton.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                    // try {
                    //     ctrler.setCurrentUser("uuuu");
                    // } catch (IOException | SQLException e1) {
                    //     // TODO Auto-generated catch block
                    //     e1.printStackTrace();
                    // }
                    FrameTool.changePanel(originalFrame, new CommandPanel(originalFrame));
                    
                }  
            }); 


    }


    
}
