package H13;

import java.awt.*;
import java.applet.*;

public class Opdr131 extends Applet {

    private

    int x1, y1, x2, y2, x3, y3;

    public void init () {

        x1 = 60;
        y1 = 200;
        x2 = 200;
        y2 = 200;
        x3 = 130;
        y3 = 60;


    }

    public void paint (Graphics g) {
        tekenDriehoek();

    }
    public void tekenDriehoek () {
        getGraphics().drawLine(x1,y1,x2,y2);
        getGraphics().drawLine(x2,y2,x3,y3);
        getGraphics().drawLine(x3,y3,x1,y1);


    }

}