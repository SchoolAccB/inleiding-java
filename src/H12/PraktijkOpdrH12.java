package H12;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class PraktijkOpdrH12 extends Applet {

    int teller;

    Label naam;
    Label nummer;

    TextField tekstvaknamen;
    TextField tekstvaknummers;

    Button okKnop;

    String[] namen = new String[10];
    int[] nummers = new int[10];

    public void init() {

        setSize(600, 400);

        naam = new Label("Naam:");
        add(naam);

        tekstvaknamen = new TextField(12);
        add(tekstvaknamen);

        nummer = new Label("Nummer:");
        add(nummer);

        tekstvaknummers = new TextField(8);
        add(tekstvaknummers);

        okKnop = new Button("Ok");
        okKnop.addActionListener(new okKnopListener());
        add(okKnop);

        for(int i = 0; i < namen.length; i++) {
            namen[i] = " ";
        }

        for(int i = 0; i < nummers.length; i++) {
            nummers[i] = 0;
        }
    }
    public void paint (Graphics g) {

        for (int i = 0; i < namen.length; i++) {
            g.drawString("" + namen[i], 50, 20 * i + 60);
        }
        for (int i = 0; i < nummers.length; i++) {
                g.drawString("" + nummers[i], 120, 20 * i + 60);
            }

    }
    class okKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            namen[teller] = tekstvaknamen.getText();

            nummers[teller] = Integer.parseInt(tekstvaknummers.getText());

            teller++;

            tekstvaknamen.setText("");
            tekstvaknummers.setText("");

            repaint();
        }
    }
}

