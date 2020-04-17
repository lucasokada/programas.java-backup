package com.br;

//o aumento da luminosidade é feito pela multiplicaçao de cada pixel por um valor alfa e adicionando outro valor beta

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.highgui.Highgui;

public class EnhanceBrightness {

    static double alpha = 10;
    static double beta = 50;

    public static void enhanceBrightness()
    {
        try {
            System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
            Mat source = Highgui.imread("/home/lucas/Desktop/images/lake-aurora.jpg", Highgui.CV_LOAD_IMAGE_COLOR);
            Mat destination = new Mat(source.rows(), source.cols(), source.type());

            source.convertTo(destination, -1, alpha, beta);
            Highgui.imwrite("/home/lucas/Desktop/images/lake-aurora-brightness-alpha=10.jpg", destination);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
