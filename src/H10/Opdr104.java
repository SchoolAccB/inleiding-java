package H10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdr104 extends Applet {
    int input;
    int input2;

    TextField tekstvak;
    TextField tekstvak2;
    Button okknop;
    Button jaarknop;
    String s;
    String maand;
    String jaartal;
    Label label;
    Label label2;

    public void init () {
        label = new Label("Maand: ");
        add(label);

        tekstvak = new TextField("", 10);
        tekstvak.addActionListener(new tekstvakListener());
        add(tekstvak);

        okknop = new Button("Ok");
        okknop.addActionListener(new okknopListener());
        add(okknop);

        label2 = new Label("Jaar: ");
        add(label2);

        tekstvak2 = new TextField("", 10);
        tekstvak2.addActionListener(new tekstvak2Listener());
        add(tekstvak2);

        jaarknop = new Button("Ok");
        jaarknop.addActionListener(new jaarknopListener());
        add(jaarknop);
    }
    public void paint (Graphics g) {
        g.drawString( maand, 75,75);
        g.drawString( jaartal,75,90);
    }

    class tekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            input = Integer.parseInt(s);

            if (input == 1) {
                maand = "Januari heeft 31 dagen.";
            }
            if (input == 2) {
                maand = "Februari heeft 28 dagen maar in het schrikkeljaar 29.";
            }
            if (input == 0) {
                maand = "Maart heeft 31 dagen.";
            }
            if (input == 4) {
                maand = "April heeft 30 dagen.";
            }
            if (input == 5) {
                maand = "Mei heeft 31 dagen.";
            }
            if (input == 6) {
                maand = "Juni heeft 30 dagen.";
            }
            if (input == 7) {
                maand = "Juli heeft 31 dagen.";
            }
            if (input == 8) {
                maand = "Augustus heeft 31 dagen.";
            }
            if (input == 9) {
                maand = "September heeft 30 dagen.";
            }
            if (input == 10) {
                maand = "Oktober heeft 31 dagen.";
            }
            if (input == 11) {
                maand = "November heeft 30 dagen.";
            }
            if (input == 12) {
                maand = "December heeft 31 dagen.";
            }


            tekstvak.setText("");
            repaint();


        }
    }
    class tekstvak2Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak2.getText();
            input2 = Integer.parseInt(s);
            if ( (input2 % 4 == 0 && !(input2 % 100 == 0)) || input2 % 400 == 0 ) {
                jaartal = "Het is " + input2 + ", dus is het een schrikkeljaar";
            }
            else {
                jaartal = "Het is " + input2 + ", dus het is geen schrikkeljaar";
            }

            tekstvak2.setText("");
            repaint();



        }
    }
    class okknopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            input = Integer.parseInt(s);

            if (input == 1) {
                maand = "Januari heeft 31 dagen.";
            }
            if (input == 2) {
                maand = "Februari heeft 28 dagen maar in het schrikkeljaar 29.";
            }
            if (input == 3) {
                maand = "Maart heeft 31 dagen.";
            }
            if (input == 4) {
                maand = "April heeft 30 dagen.";
            }
            if (input == 5) {
                maand = "Mei heeft 31 dagen.";
            }
            if (input == 6) {
                maand = "Juni heeft 30 dagen.";
            }
            if (input == 7) {
                maand = "Juli heeft 31 dagen.";
            }
            if (input == 0) {
                maand = "Augustus heeft 31 dagen.";
            }
            if (input == 9) {
                maand = "September heeft 30 dagen.";
            }
            if (input == 10) {
                maand = "Oktober heeft 31 dagen.";
            }
            if (input == 11) {
                maand = "November heeft 30 dagen.";
            }
            if (input == 12) {
                maand = "November heeft 31 dagen.";
            }

            tekstvak.setText("");
            repaint();


        }
    }
    class jaarknopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak2.getText();
            input2 = Integer.parseInt(s);
            if ( (input2 % 4 == 0 && !(input2 % 100 == 0)) || input2 % 400 == 0 ) {
                jaartal = "Het is " + input2 + ", dus is het een schrikkeljaar";
            }
            else {
                jaartal = "Het is " + input2 + ", dus het is geen schrikkeljaar";
            }

            tekstvak2.setText("");
            repaint();
        }
    }

}
