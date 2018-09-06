package H06;

import java.awt.*;
import java.applet.*;

public class Opdr62 extends Applet{

    int secondesperuur;
    int secondesperdag;
    int secondesperjaar;


    public void init() {

        secondesperuur = 60*60;
        secondesperdag = secondesperuur*24;
        secondesperjaar = secondesperdag*365;
    }

    public void paint (Graphics g) {

        g.drawString("Secondes per uur: " + secondesperuur,20,20);
        g.drawString("Secondes per dag: " + secondesperdag,20,35);
        g.drawString("Secondes per jaar: " + secondesperjaar, 20,50);
    }



}


