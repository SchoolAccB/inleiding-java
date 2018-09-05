package H06;

import java.awt.*;
import java.applet.*;

public class Opdr63 extends Applet {

    int negatiefgetal;


    public void init() {

        negatiefgetal = 2147483647+1;
    }

    public void paint (Graphics g) {

        g.drawString("Negatief getal: " + negatiefgetal,20,20);
    }

    




}
