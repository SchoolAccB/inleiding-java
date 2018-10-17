package H14;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;

public class PraktijkOpdrH14 extends  Applet {

    private Image[] speelstenen;
    private URL pad;

    int spelerzet;
    int comzet;
    int aantal;
    int random;

    int x;
    int y;

    TextField tekstvak;
    Button resetKnop;
    Label label;

    String gewonnen;
    String stenenweg;

    public void init() {

        setSize(600, 500);

        aantal = 23;

        pad = PraktijkOpdrH14.class.getResource("/Resources/");

        speelstenen = new Image[23];

        for (int i = 0; i < aantal; i++) {
            speelstenen[i] = getImage(pad, "speelsteen.jpg");
        }

        label = new Label("Haal 1, 2 of 3 stenen weg.");
        add(label);

        tekstvak = new TextField(10);
        tekstvak.requestFocus();
        tekstvak.addActionListener(new tekstvakListener());
        add(tekstvak);

        resetKnop = new Button("Restart");
        resetKnop.addActionListener(new resetKnopListener());
        add(resetKnop);

        label = new Label("Haal 1, 2 of 3 stenen weg.");

        x = 40;
        y = 40;

    }

    public void paint(Graphics g) {

        x = 40;
        y = 80;

        for (int i = 0; i < aantal; i++) {
            g.drawImage(speelstenen[i], x, y, 60, 60, this);
            x += 100;
            if (i == 4 || (i == 9 || (i == 14 | (i == 19 || (i == 24))))) {
                y += 80;
                x = 40;
            }
        }

        g.drawString(gewonnen, 60,60);

        if (comzet > 0 && comzet <= 3) {
            g.drawString(stenenweg, 240, 60);
        }
    }
    class resetKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            gewonnen = "";
            stenenweg = "";
            aantal = 23;
            repaint();
        }
    }
    class tekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            spelerzet = Integer.parseInt(tekstvak.getText());

            gewonnen = "";
            stenenweg = "";

            random = (int) (Math.random() * 3 + 1);

            aantal = aantal - spelerzet;

            if (aantal == 1) {
                gewonnen = "Je hebt gewonnen.";
            }
            if (spelerzet < 1 || spelerzet > 3) {
                spelerzet = 0;
                comzet = 0;
            }
            else {
                if (aantal <= 1) {
                    comzet = 0;
                }
                if (aantal == 2) {
                    comzet = 1;
                }
                if (aantal == 3) {
                    comzet = 2;
                }
                if (aantal == 4) {
                    comzet = 3;
                }
                if (aantal == 20) {
                    comzet = 3;
                }
                if (aantal == 22) {
                    comzet = 1;
                }
                if (aantal == 21 || aantal == 17 || aantal == 13 || aantal == 9 || aantal == 5) {
                    comzet = random;
                }
                if (aantal > 1 && aantal != 1 && aantal != 5 && aantal != 9 && aantal != 13 && aantal != 17 && aantal != 21 && aantal < 20) {
                    comzet = (4 - spelerzet);
                }
            }

            aantal = aantal - comzet;

            if(comzet == 1) {
                stenenweg = "De computer heeft 1 steen weggehaald.";
            }
            if(comzet == 2 || comzet == 3){
                stenenweg = "De computer heeft " + comzet + " stenen weggehaald.";
            }

            if (gewonnen == "" && gewonnen != "speler" && aantal <= 1) {
                gewonnen = "De computer heeft gewonnen.";
            }

            tekstvak.setText("");
            repaint();

        }
    }
}
