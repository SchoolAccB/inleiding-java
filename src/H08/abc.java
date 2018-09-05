package abc;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class abc extends Applet{


    Button okknop;
    Button clearknop;
    String schermtekst;
    TextField tekstvak;
    Label label;
    String s;


    public void init(){
        setSize(600,600);
        tekstvak = new TextField("", 30);
        s = "";
        okknop = new Button();
        okknop.setLabel("Ok");
        add(okknop);
        okknop.addActionListener( new OkKnopListener() );
        tekstvak = new TextField("",60);
        add (tekstvak);
        label = new Label("Typ hier iets");
        add(label);

    }

    public void paint(Graphics g){
        setBackground(Color.white);
        g.drawString(s, 50, 60 );

        g.drawString(schermtekst,50,60);
    }

    class OkKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            s = tekstvak.getText();
            tekstvak.setText("");
            schermtekst = "";
            repaint();

        }
    }
    class ClearKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            tekstvak.setText("  ");
            repaint();

        }
    }
}






