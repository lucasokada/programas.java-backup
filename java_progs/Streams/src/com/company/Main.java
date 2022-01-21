package com.company;

import javax.sound.midi.Sequence;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.SequenceInputStream;

public class Main {

    public static void main(String[] args) {
        String filePath1 = "/Users/lucasokada/Desktop/java_progs/Streams/src/file1.txt";
        String filePath2 = "/Users/lucasokada/Desktop/java_progs/Streams/src/file2.txt";
        File file1 = new File(filePath1);
        File file2 = new File(filePath2);
        System.out.println(file1.getAbsolutePath());

        try(FileInputStream fis = new FileInputStream(file1); FileInputStream fis2 = new FileInputStream(file2); SequenceInputStream sis = new SequenceInputStream(fis, fis2)) {
//            int data;
//            while((data = fis.read()) != -1) {
//                System.out.print((char)data);
//            }
            int data;
            while((data = sis.read()) != -1) {
                System.out.print((char)data);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
