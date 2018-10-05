package H14;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.util.Random;
import java.net.URL;


public class Opdr142 extends Applet {

    Button deelKaarten;

    String deck[];
    String kaart;

    int x;
    int y;

    private URL pad;
    private AudioClip cards;

    public void init() {

        pad = Opdr142.class.getResource("/Resources/");

        cards = getAudioClip(pad, "cards.wav");

        x = 40;
        y = 40;

        setSize(1000, 600);

        deelKaarten = new Button("Deel kaarten");
        deelKaarten.addActionListener(new deelKaartenListener());
        add(deelKaarten);

        deck = new String[52];

        deck[0] = "Harten 2";
        deck[1] = "Harten 3";
        deck[2] = "Harten 4";
        deck[3] = "Harten 5";
        deck[4] = "Harten 6";
        deck[5] = "Harten 7";
        deck[6] = "Harten 8";
        deck[7] = "Harten 9";
        deck[8] = "Harten 10";
        deck[9] = "Harten boer";
        deck[10] = "Harten vrouw";
        deck[11] = "Harten heer";
        deck[12] = "Harten aas";

        deck[13] = "Ruiten 2";
        deck[14] = "Ruiten 3";
        deck[15] = "Ruiten 4";
        deck[16] = "Ruiten 5";
        deck[17] = "Ruiten 6";
        deck[18] = "Ruiten 7";
        deck[19] = "Ruiten 8";
        deck[20] = "Ruiten 9";
        deck[21] = "Ruiten 10";
        deck[22] = "Ruiten boer";
        deck[23] = "Ruiten vrouw";
        deck[24] = "Ruiten heer";
        deck[25] = "Ruiten aas";

        deck[26] = "Klaveren 2";
        deck[27] = "Klaveren 3";
        deck[28] = "Klaveren 4";
        deck[29] = "Klaveren 5";
        deck[30] = "Klaveren 6";
        deck[31] = "Klaveren 7";
        deck[32] = "Klaveren 8";
        deck[33] = "Klaveren 9";
        deck[34] = "Klaveren 10";
        deck[35] = "Klaveren boer";
        deck[36] = "Klaveren vrouw";
        deck[37] = "Klaveren heer";
        deck[38] = "Klaveren aas";

        deck[39] = "Schoppen 2";
        deck[40] = "Schoppen 3";
        deck[41] = "Schoppen 4";
        deck[42] = "Schoppen 5";
        deck[43] = "Schoppen 6";
        deck[44] = "Schoppen 7";
        deck[45] = "Schoppen 8";
        deck[46] = "Schoppen 9";
        deck[47] = "Schoppen 10";
        deck[48] = "Schoppen boer";
        deck[49] = "Schoppen vrouw";
        deck[50] = "Schoppen heer";
        deck[51] = "Schoppen aas";

    }
    public void paint (Graphics g) {

        g.drawString("Speler 1:", 150, 120);
        g.drawString("Speler 2:", 350, 120);
        g.drawString("Speler 3:", 550, 120);
        g.drawString("Speler 4:", 750, 120);

    }
    class deelKaartenListener implements ActionListener {
        public void actionPerformed (ActionEvent e) {

            x = 150;
            y = 150;

            for (int i = 0; i < 52; i++) {
                getGraphics().drawString(deelKaart(), x, y);
                y += 20;
                if (i == 12||(i == 25||(i == 38||(i == 52)))) {
                    x += 200;
                    y = 150;
                }

            }
            cards.play();


        }
    }
    private String deelKaart() {

        int random = new Random().nextInt(deck.length);
        kaart = deck[random];

        //Vervang de inhoud van deck

        String[] hulpLijst = new String[deck.length - 1];
        int hulpindex = 0;

        for (int i = 0; i < deck.length; i++) {
            if (i != random) {
                hulpLijst[hulpindex] = deck[i];
                hulpindex++;
            }
        }
        deck = hulpLijst;
        return kaart;
    }
}
