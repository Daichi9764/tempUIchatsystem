package prog_avancee.UI;

import java.awt.Dimension;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.*;

import prog_avancee.Controller.Controller;
import prog_avancee.DB.UserTable;

public class CommandPanel extends JPanel {
    protected JButton l;
    protected JButton c;
    protected JButton d;
    protected JButton q;
    protected JButton me;
    protected JPanel blank;
    Controller ctrler;


    public CommandPanel(JFrame originalFrame) {
        // l (list users), c (change username), d (discover network), q (disconnect), me
        // (display user properties)

        setSize(500, 500);

        l = new JButton("list users");
        c = new JButton("change username");
        d = new JButton("discovery network");
        q = new JButton("disconnect");
        me = new JButton("display user properties");
        blank = new JPanel();

        try {
            ctrler = Controller.getInstance();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        
        blank.setSize(300,300);
        

        add(l);
        add(c);
        add(d);
        add(q);
        add(me);
        add(blank);


        l.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                FrameTool.printStringToPane(originalFrame, blank, UserTable.getInstance().toString());
            }
        });

        c.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                FrameTool.changePanel(originalFrame, new UsernameChoicePanel(originalFrame));
            }
        });

        d.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    ctrler.discoverContacts();
                } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
            }
        });

        q.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);

            }
        });

        me.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                FrameTool.printStringToPane(originalFrame, blank, "You are :" + ctrler.getCurrentUser());
          
            }
        });

    }

}
