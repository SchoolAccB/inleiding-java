package H08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdr82 extends Applet {

    Button manKnop;
    Button vrouwKnop;
    Button jongKnop;
    Button meisKnop;

    int mannen;
    int vrouwen;
    int jongens;
    int meisjes;
    int totaal;

    public void init() {

        setSize(800, 400);
        manKnop = new Button ("Mannen");
        ManKnopListener mkl = new ManKnopListener();
        manKnop.addActionListener ( mkl );
        vrouwKnop = new Button ("Vrouwen");
        VrouwKnopListener vkl = new VrouwKnopListener();
        vrouwKnop.addActionListener( vkl );
        jongKnop = new Button ("Potentiële mannelijke leerlingen");
        JongKnopListener jkl = new JongKnopListener();
        jongKnop.addActionListener( jkl );

        meisKnop = new Button ("Potentiële vrouwelijke leerlignen");
        MeisKnopListener mskl = new MeisKnopListener();
        meisKnop.addActionListener( mskl );
        add(manKnop);
        add(vrouwKnop);
        add(jongKnop);
        add(meisKnop);
        mannen = 0;
        vrouwen = 0;
        jongens = 0;
        meisjes = 0;
        totaal = 0;


    }
    public void paint (Graphics g) {
        g.drawString("Mannen: " + mannen,40,75);
        g.drawString("Vrouwen: " + vrouwen,40,100);
        g.drawString("Jongens: " + jongens,40,125);
        g.drawString("Meisjes: " + meisjes,40,150);
        g.drawString("Totaal: " + totaal,40,180);


    }
    class ManKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            mannen = mannen + 1;
            totaal = totaal + 1;

            repaint();


        }
    }
    class VrouwKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            vrouwen = vrouwen + 1;
            totaal = totaal + 1;

            repaint();


        }
    }
    class JongKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            jongens = jongens + 1;
            totaal = totaal + 1;

            repaint();


        }
    }
    class MeisKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            meisjes = meisjes + 1;
            totaal = totaal + 1;

            repaint();


        }
    }

}
