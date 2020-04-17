package com.br;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.highgui.Highgui;
import org.opencv.imgproc.Imgproc;

//Imcodecs.imread()/Imcodecs.imwrite() – These methods are used to read and write images as Mat objects which are rendered by OpenCV.

public class EnhanceContrast {

    public static void enhanceContrast()
    {
        try {
            //input image
            System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
            Mat source = Highgui.imread("/home/lucas/Desktop/images/grayscale.jpg",
                    Highgui.CV_LOAD_IMAGE_GRAYSCALE);

            Mat destination = new Mat(source.rows(),source.cols(),source.type());

            //histogram equalization
            Imgproc.equalizeHist(source, destination);

            //write output image
            Highgui.imwrite("/home/lucas/Desktop/contrast.jpg", destination);

        } catch (Exception e) {
            System.out.println("error: " + e.getMessage());
        }
    }
}
