package com.practice;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.*;

public class MyWindow extends JFrame 
{

    private JLabel heading;
    private JLabel clocklabel;

    private Font font = new Font(getName(), Font.BOLD, 35);
    MyWindow() 
    {
        setTitle("My clock");
        setSize(1000, 1000);
        setLocation(300, 50);
        this.createGUI();
        this.startClock();
        setVisible(true);
    }

    public void createGUI()
    {
        heading = new JLabel("My Clock");
        clocklabel = new JLabel("Clock");

        heading.setFont(font);
        clocklabel.setFont(font);

        this.setLayout(new GridLayout(2 ,1));
        this.add(heading);
        this.add(clocklabel);

    }
    public void startClock()
    {
        Timer timer = new Timer (1000, new ActionListener ()
        {
        @Override
            public void actionPerformed(ActionEvent e) 
            {
                Date d = new Date();
                SimpleDateFormat sfd = new SimpleDateFormat("hh : mm : ss a");
                String datetime = sfd.format(d);
                clocklabel.setText(datetime);
            }

        });
        timer.start();
    }
}
