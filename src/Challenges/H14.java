package Challenges;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.net.URL;

public class H14 extends Applet {

    Button speelKnop;
    Button puntenKnop;

    String geenPunten;
    String gewonnen;

    int krediet;

    int teller;
    int teller2;
    int teller3;

    double random;
    double random2;
    double random3;

    private Image fruitpics[];
    private URL pad;
    private AudioClip uwin;
    private AudioClip jackpot;

    public void init () {

        teller = 0;
        teller2 = 0;
        teller3 = 0;

        fruitpics = new Image[20];

        pad = H14.class.getResource("/Resources/");

        uwin = getAudioClip(pad, "uwin.wav");
        jackpot = getAudioClip(pad, "jackpot.wav");

        fruitpics[0] = getImage(pad, "fruit_1.jpg");
        fruitpics[1] = getImage(pad, "fruit_2.jpg");
        fruitpics[2] = getImage(pad, "fruit_3.jpg");
        fruitpics[3] = getImage(pad, "fruit_4.jpg");
        fruitpics[4] = getImage(pad, "fruit_5.jpg");
        fruitpics[5] = getImage(pad, "fruit_6.jpg");
        fruitpics[6] = getImage(pad, "fruit_7.jpg");
        fruitpics[7] = getImage(pad, "fruit_8.jpg");
        fruitpics[8] = getImage(pad, "fruit_9.jpg");
        fruitpics[9] = getImage(pad, "fruit_10.jpg");
        fruitpics[10] = getImage(pad, "fruit_11.jpg");
        fruitpics[11] = getImage(pad, "fruit_12.jpg");
        fruitpics[12] = getImage(pad, "fruit_13.jpg");
        fruitpics[13] = getImage(pad, "fruit_14.jpg");
        fruitpics[14] = getImage(pad, "fruit_15.jpg");
        fruitpics[15] = getImage(pad, "fruit_16.jpg");
        fruitpics[16] = getImage(pad, "fruit_17.jpg");
        fruitpics[17] = getImage(pad, "fruit_18.jpg");
        fruitpics[18] = getImage(pad, "fruit_19.jpg");
        fruitpics[19] = getImage(pad, "fruit_20.jpg");

        setSize(600,400);

        krediet = 10;
        geenPunten = " ";
        gewonnen = " ";

        speelKnop = new Button("Speel");
        speelKnop.addActionListener(new speelKnopListener());
        add(speelKnop);

        puntenKnop = new Button("Koop meer punten");
        puntenKnop.addActionListener(new puntenKnopListener());
        add(puntenKnop);

        puntenKnop.setEnabled(false);

        if (krediet == 0) {
            puntenKnop.setEnabled(true);
        }
    }
    public void paint (Graphics g) {

        g.drawString("Uw krediet is: " + krediet, 80, 25 );
        g.drawString(geenPunten, 185, 50);
        g.drawString(gewonnen, 200, 270);

        g.drawImage(fruitpics[teller], 150, 70,100,180, this);
        g.drawImage(fruitpics[teller2], 250, 70,100,180, this);
        g.drawImage(fruitpics[teller3], 350, 70,100,180, this);


        if (krediet == 1) {
            geenPunten = "Koop nieuwe punten om verder te spelen.";
        }
         else {
             geenPunten = " ";
        }


    }
    class speelKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            random = (Math.random() * 19 + 0);

            random2 = (Math.random() * 19 + 0);

            random3 = (Math.random() * 19 + 0);

            teller = (int) random;

            teller2 = (int) random2;

            teller3 = (int) random3;

//            teller = 3;
//
//            teller2 = 3;
//            teller3 = 3;

            if (teller == teller2 &&(teller2 == teller &&(teller == teller3 &&(teller3 == teller &&(teller2 == teller3 &&(teller3 == teller2)))))) {
                krediet = krediet + 20;
                gewonnen = "U heeft 20 kredietpunten gewonnen!";
                jackpot.play();
            }
            else if (teller == teller2 || (teller2 == teller || (teller == teller3 || teller3 == teller || (teller3 == teller2 ||(teller2 == teller3))))) {
                krediet = krediet + 4;
                gewonnen = "U heeft 4 kredietpunten gewonnen!";
                uwin.play();
            }
            else {
                gewonnen = " ";
            }

            if (krediet == 1) {
                speelKnop.setEnabled(false);
            }
            if (krediet == 1) {
                puntenKnop.setEnabled(true);
            }
            krediet = krediet - 1;

            repaint();
        }
    }
    class puntenKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            krediet = krediet + 10;

            if (krediet == 10) {
                puntenKnop.setEnabled(false);
            }
            speelKnop.setEnabled(true);

            repaint();
        }
    }
}
