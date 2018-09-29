package Challenges;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class H10 extends Applet {

    Label label;
    Button okKnop;
    TextField tekstvak;

    String tijdtehoog;

    String tijdrio;
    String tijdny;
    String tijdtokio;
    String tijdzuidafr;

    int input;

    int rio;
    int ny;
    int tokio;
    int afr;

    public void init () {

        label = new Label("Nederlandse tijd: ");
        add(label);

        tekstvak = new TextField(20);
        tekstvak.addActionListener(new tekstvakListener());
        add(tekstvak);

        okKnop = new Button("Ok");
        okKnop.addActionListener(new okKnopListener());
        add(okKnop);
    }
    public void paint (Graphics g) {

        g.drawString(tijdtehoog, 40,40);
        g.drawString(tijdrio, 40, 95);

    }
    class tekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            input = Integer.parseInt(tekstvak.getText());

            tijdtehoog = "De Nederlandse tijd is " + input + " uur.";

            if (input <= 0) {
                input = input + 24;
            }




            rio = input - 3;

            tijdrio = "In Rio is het " + rio + " uur.";

            if (rio <= 0) {
                input = input + 24;
            }
            if (input > 24 || input < 0) {
                tijdtehoog = "Het ingevoerde cijfer is geen geldige tijd.";
                tijdrio = "";
                tijdny = "";
                tijdtokio = "";
                tijdzuidafr = "";
            }
            tekstvak.setText("");
            repaint();
        }
    }

    class okKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {


                }
            }
        }
