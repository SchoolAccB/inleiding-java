package H10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class PraktijkOpdrH10 extends Applet {

    double input;

    TextField tekstvak;
    Button okKnop;
    Label label;
    String s;
    String cijfer;

    public void init () {

        label = new Label("Voer je cijfer in:");
        add(label);

        tekstvak = new TextField("", 5);
        tekstvak.addActionListener(new tekstvakListener());
        add(tekstvak);

        okKnop = new Button("Ok");
        okKnop.addActionListener(new okKnopListener());
        add(okKnop);

        cijfer = "";
    }
    public void paint (Graphics g) {

        g.drawString(" " + cijfer, 100, 50);
    }
    class tekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            s = tekstvak.getText();
            input = Double.parseDouble(s);

            if (input > 0.1 && (input < 3.5))  {
                cijfer = "Je cijfer is slecht.";
            }
            if (input > 3.4 && (input < 4.5))  {
                cijfer = "Je cijfer is onvoldoende.";
            }
            if (input > 4.4 && (input < 5.5))  {
                cijfer = "Je cijfer is matig.";
            }
            if (input > 5.4 && (input < 7.5))  {
                cijfer = "Je cijfer is voldoende.";
            }
            if (input > 7.4 && (input < 10.1))  {
                cijfer = "Je cijfer is goed.";
            }
            if (input > 10 ||(input < 0)) {
                cijfer = "Je hebt geen correct cijfer ingevoerd.";
            }
            tekstvak.setText("");
            repaint();
        }
    }
    class okKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            s = tekstvak.getText();
            input = Double.parseDouble(s);

            if (input > 0.1 && (input < 3.5))  {
                cijfer = "Je cijfer is slecht.";
            }
            if (input > 3.4 && (input < 4.5))  {
                cijfer = "Je cijfer is onvoldoende.";
            }
            if (input > 4.4 && (input < 5.5))  {
                cijfer = "Je cijfer is matig.";
            }
            if (input > 5.4 && (input < 7.5))  {
                cijfer = "Je cijfer is voldoende.";
            }
            if (input > 7.4 && (input < 10.1))  {
                cijfer = "Je cijfer is goed.";
            }
            if (input > 10 ||(input < 0)) {
                cijfer = "Je hebt geen correct cijfer ingevoerd.";
            }
            tekstvak.setText("");
            repaint();
        }
    }

}
