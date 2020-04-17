package com.br;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class Test extends JPanel { //JPanel organizar componentes na criaçao da tela

    public void paint(Graphics g) {
        Image img = createImageWithText();
        g.drawImage(img, 20,20,this);
    }

    private Image createImageWithText() {
        BufferedImage bufferedImage = new BufferedImage(200,200,BufferedImage.TYPE_INT_RGB);
        Graphics g = bufferedImage.getGraphics();
        Graphics g2 = bufferedImage.getGraphics();

        g.drawString("www.tutorialspoint.com", 20,20);
        g.drawString("www.tutorialspoint.com", 20,40);
        g.drawString("www.tutorialspoint.com", 20,60);
        g.drawString("www.tutorialspoint.com", 20,80);
        g.drawString("www.tutorialspoint.com", 20,100);

        g2.setColor(Color.RED);
        g2.drawLine(0,0,30,40);
        g2.drawArc(0,0,30,40,50,60);

        return bufferedImage;
    }
}
