package H08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdr83 extends Applet {

Label label;
Button btwKnop;
TextField tekstvak;

double btwbedrag;


    public void init() {

        setSize(600, 400);

        tekstvak = new TextField("", 20);

        btwKnop = new Button("Bereken");
        btwKnopListener bkl = new btwKnopListener ();
        btwKnop.addActionListener(bkl);

        label = new Label("Bereken hier je bedrag inclusief BTW:");

        add(label);
        add(tekstvak);
        add(btwKnop);


    }
    public void paint (Graphics g) {
        g.drawString("Het getal is " + btwbedrag, 50, 60 );





    }
    class btwKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            btwbedrag = Integer.parseInt(tekstvak.getText());
            btwbedrag = btwbedrag * 1.21;
            tekstvak.setText("");
            repaint();

        }
    }
}
