package com.br;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class GrayScale {
    BufferedImage image;
    int width;
    int height;

    public GrayScale() {

        try {
            File input = new File("/home/lucas/Desktop/images/sea.jpg");
            image = ImageIO.read(input);
            width = image.getWidth();
            height = image.getHeight();

            for(int i=0; i<height; i++) {

                for(int j=0; j<width; j++) {

                    Color c = new Color(image.getRGB(j, i));
                    int red = (int)(c.getRed()/* * 0.299*/);
                    //System.out.println("red = "+red);
                    int green = (int)(c.getGreen()/* * 0.587*/);
                    //System.out.println("green = "+green);
                    int blue = (int)(c.getBlue()/* *0.114*/);
                    //System.out.println("blue = "+blue);
                    int average = (red + green + blue) / 3;
                    //System.out.println("average = "+average);
                    Color newColor = new Color(/*red+green+blue*/ average,

                            /*red+green+blue*/ average,/*red+green+blue*/ average);

                    image.setRGB(j,i,newColor.getRGB());
                }
            }

            File ouptut = new File("/home/lucas/Desktop/images/sea-grayscale.jpg");
            ImageIO.write(image, "jpg", ouptut);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
