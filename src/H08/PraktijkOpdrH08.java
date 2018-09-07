package H08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class PraktijkOpdrH08 extends Applet {

    TextField tekstvak1;
    TextField tekstvak2;

    Button plusKnop;
    Button minKnop;
    Button keerKnop;
    Button deelKnop;

    int antwoord1;
    int antwoord2;
    int eindantwoord;

    Label uitkomst;



    public void init () {

        setSize(600,400);

        tekstvak1 = new TextField("", 15);
        tekstvak2 = new TextField("", 15);
        add(tekstvak1);
        add(tekstvak2);

        plusKnop = new Button("+");
        minKnop = new Button("-");
        keerKnop = new Button("*");
        deelKnop = new Button("/");

        add(plusKnop);
        add(minKnop);
        add(keerKnop);
        add(deelKnop);

        uitkomst = new Label("Answer");
        uitkomst.setLocation(100,100);
        add(uitkomst);

        plusKnop.addActionListener ( new plusKnopListener () );
        minKnop.addActionListener ( new minKnopListener () );
        keerKnop.addActionListener ( new keerKnopListener () );
        deelKnop.addActionListener ( new deelKnopListener () );

    }
    public void paint (Graphics g)  {



    }
    class plusKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            antwoord1 = Integer.parseInt(tekstvak1.getText());
            antwoord2 =  Integer.parseInt(tekstvak2.getText());
            eindantwoord = antwoord1 + antwoord2;
            uitkomst.setText("" + eindantwoord);
            repaint();



        }
    }
    class minKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            antwoord1 = Integer.parseInt(tekstvak1.getText());
            antwoord2 =  Integer.parseInt(tekstvak2.getText());
            eindantwoord = antwoord1 - antwoord2;
            uitkomst.setText("" + eindantwoord);
            repaint();



        }
    }class keerKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            antwoord1 = Integer.parseInt(tekstvak1.getText());
            antwoord2 =  Integer.parseInt(tekstvak2.getText());
            eindantwoord = antwoord1 * antwoord2;
            uitkomst.setText("" + eindantwoord);
            repaint();



        }
    }
    class deelKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            antwoord1 = Integer.parseInt(tekstvak1.getText());
            antwoord2 =  Integer.parseInt(tekstvak2.getText());
            eindantwoord = antwoord1 / antwoord2;
            uitkomst.setText("" + eindantwoord);
            repaint();



        }
    }

}
