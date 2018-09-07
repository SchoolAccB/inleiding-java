package Opdr81;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdr81 extends Applet {

    Button knop1;
    Button knop2;
    TextField tekstvak;
    String schermtekst;
    Label label;


    public void init() {

        knop1 = new Button("Ok");
        knop2 = new Button("Clear");
        label = new Label ("Type hier");
        add(label);

        tekstvak = new TextField("",20);
        add(tekstvak);
        knop1.addActionListener ( new Knop1Listener () );
        knop2.addActionListener ( new Knop2Listener () );
        add(knop1);
        add(knop2);





    }
    public void paint (Graphics g) {

        g.drawString(schermtekst,50,60);

    }
    class Knop1Listener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            schermtekst = tekstvak.getText();
            tekstvak.setText("");
            repaint();
        }
    }
    class Knop2Listener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            schermtekst = tekstvak.getText();
            tekstvak.setText("");
            repaint();

        }
    }






}


