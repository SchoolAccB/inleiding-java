package H13;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdr133 extends Applet {

    boolean teken;
    boolean teken2;

    int x, y, width, height;
    int teller;

    Button rodeMuur;
    Button grijzeMuur;

    public void init() {
        teken = false;

        width = 100;
        height = 33;

        rodeMuur = new Button("Rode muur");
        rodeMuur.addActionListener(new rodeMuurListener());
        add(rodeMuur);

        grijzeMuur = new Button("Grijze muur");
        grijzeMuur.addActionListener(new grijzeMuurListener());
        add(grijzeMuur);
    }
    public void paint (Graphics g) {

        if (teken == true) {
            tekenRodeMuur(g);
        }
        if (teken2 == true) {
            tekenGrijzeMuur(g);
        }
    }
    void tekenRodeMuur(Graphics g) {

        y = 0;
        width = 100;
        height = 33;

        for (int i = 0; i < 10; i++) {
            x = -50;
            for (int j = 0; j < 5; j++) {
                g.setColor(Color.black);
                g.drawRect(x, y, width, height);
                g.setColor(Color.red);
                g.fillRect(x + 1, y + 1, width - 1, height - 1);
                x += 100;
            }
            y += 33;
            x = 0;
            for (int k = 0; k < 4; k++) {
                g.setColor(Color.black);
                g.drawRect(x, y, width, height);
                g.setColor(Color.red);
                g.fillRect(x + 1, y + 1, width - 1, height - 1);
                x += 100;
            }
            y += 33;
        }
    }
    void tekenGrijzeMuur(Graphics g) {

        y = 0;
        width = 120;
        height = 44;

        for(int i = 0; i < 10; i++) {

            x = -60;
            for (int j = 0; j < 5; j++) {
                g.setColor(Color.black);
                g.drawRect(x, y, width, height);
                g.setColor(Color.gray);
                g.fillRect(x + 1, y + 1, width - 1, height - 1);
                x += 120;
            }
            y += 40;
            x = 0;
            for (int k = 0; k < 5; k++) {
                g.setColor(Color.black);
                g.drawRect(x, y, width, height);
                g.setColor(Color.gray);
                g.fillRect(x + 1, y + 1, width - 1, height - 1);
                x += 120;
            }
            y += 40;
        }
    }
    class rodeMuurListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (teken == true) {
                teken = false;
            }
            else {
                teken = true;
            }
            if (teken2 == true) {
                teken2 = false;
            }
            repaint();
        }
    }
    class grijzeMuurListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (teken2 == true) {
                teken2 = false;
            }
            else {
                teken2 = true;
            }
            if (teken == true) {
                teken = false;
            }
            repaint();
        }
    }
}


