/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;
import java.applet.*;
import java.awt.event.*;
import java.awt.*;

/**
 *
 * @author Aakas
 */
public class Hci extends Applet implements ActionListener {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    int i;
    Button Submit;
    TextField name;
    TextField regno;
    TextField m1;
    TextField m2;
    Panel p;
    int x=500;
    int y=500;
    String str="student registeration";
    public void init() {
        // TODO start asynchronous download of heavy resources
        p=new Panel();
        setLayout(new GridLayout(5,10));
        setBackground(Color.yellow);
        setForeground(Color.red);
        Submit=new Button("SUBMIT!");
        Submit.addActionListener(this);
        name=new TextField(20);
        regno=new TextField(10);
        m1=new TextField(3);
        m2=new TextField(3);
        i=0;
        add(new Label("Name:",Label.LEFT));
        //name.setLocation(10, 10);
        add(name);
        //g.drawLine(10,10,50,50);
        //name.setText("NAME");
        
        add(new Label("Regno:",Label.LEFT));
        add(regno);
        add(new Label("Mark 1",Label.LEFT));
        add(m1);
        add(new Label("Mark 2",Label.LEFT));
        add(m2);
        Submit.setSize(x,y);
        add(Submit);
    }

    // TODO overwrite start(), stop() and destroy() methods
    public void paint(Graphics G)
    {
        G.drawString(str,100,100);
        //G.drawLine(100,100,100,500);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        showStatus("Success");
        name.setText(" ");
        regno.setText(" ");
        m1.setText(" ");
        m2.setText(" ");
        
    }
}
