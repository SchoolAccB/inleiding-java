package H05;

import java.awt.*;
import java.applet.*;

public class Opdr51 extends Applet {

    Color opvulkleur;
    Color lijnkleur;
    int breedte;
    int hoogte;

    public void init() {

        opvulkleur = Color.MAGENTA;
        lijnkleur = Color.BLACK;
        breedte = 150;
        hoogte = 120;
    }


    public void paint(Graphics g)  {

        g.drawLine(10,20,120,20);

        g.drawRect(10,40,breedte,hoogte);
        g.setColor(opvulkleur);
        g.fillRect(140,40,breedte,hoogte);
        g.setColor(lijnkleur);
        g.drawArc(140,40,breedte,hoogte,0,360);
        g.drawArc(270,40,breedte,hoogte,0,360);
        g.setColor(opvulkleur);
        g.fillArc(270,40,breedte,hoogte,0,45);

        g.setColor(lijnkleur);
        g.drawRoundRect(10,120,breedte,hoogte,30,30);
        g.setColor(lijnkleur);
        g.fillRoundRect(140,120,breedte,hoogte,110,70);
        g.setColor(lijnkleur);
        g.drawArc(290,120,70,70,0,360);


    }
}
