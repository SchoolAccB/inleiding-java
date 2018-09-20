package H11;

import java.awt.*;
import java.applet.*;

public class Opdr119 extends Applet {

    int x;
    int x2;
    int x3;
    int x4;
    public void init() {


    }
    public void paint (Graphics g) {

        x = 20;
        x2 = 40;

        x3 = 40;
        x4 = 20;

        for (int teller = 0; teller < 4; teller++){


            x += 40;
            x2 += 40;
            g.setColor(Color.black);
            g.fillRect(x, 20, 21,21);
            g.drawRect(x2,20,20,20);
        }
        for (int teller = 0; teller < 4; teller++){

            x3 += 40;
            x4 += 40;
            g.drawRect(x4,40,20,20);
            g.setColor(Color.black);
            g.fillRect(x3, 40, 21,21);

        }

        x = 20;
        x2 = 40;

        for (int teller = 0; teller < 4; teller++){


            x += 40;
            x2 += 40;
            g.setColor(Color.black);
            g.fillRect(x, 60, 21,21);
            g.drawRect(x2,60,20,20);
        }

        x3 = 40;
        x4 = 20;

        for (int teller = 0; teller < 4; teller++){

            x3 += 40;
            x4 += 40;
            g.drawRect(x4,80,20,20);
            g.setColor(Color.black);
            g.fillRect(x3, 80, 21,21);

        }

        x = 20;
        x2 = 40;

        for (int teller = 0; teller < 4; teller++){


            x += 40;
            x2 += 40;
            g.setColor(Color.black);
            g.fillRect(x, 100, 21,21);
            g.drawRect(x2,100,20,20);
        }

        x3 = 40;
        x4 = 20;

        for (int teller = 0; teller < 4; teller++){

            x3 += 40;
            x4 += 40;
            g.drawRect(x4,120,20,20);
            g.setColor(Color.black);
            g.fillRect(x3, 120, 21,21);

        }

        x = 20;
        x2 = 40;

        for (int teller = 0; teller < 4; teller++){


            x += 40;
            x2 += 40;
            g.setColor(Color.black);
            g.fillRect(x, 140, 21,21);
            g.drawRect(x2,140,20,20);
        }
        x3 = 40;
        x4 = 20;

        for (int teller = 0; teller < 4; teller++){

            x3 += 40;
            x4 += 40;
            g.drawRect(x4,160,20,20);
            g.setColor(Color.black);
            g.fillRect(x3, 160, 21,21);

        }


    }
}
