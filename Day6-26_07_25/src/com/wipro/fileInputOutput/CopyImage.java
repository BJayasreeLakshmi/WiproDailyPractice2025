package com.wipro.fileInputOutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyImage {

    public static void main(String[] args) {

        String originalImage = "javalogo.jpg";
        String copiedImage = "copy.png";

        try (FileInputStream f = new FileInputStream(originalImage);
             FileOutputStream o1 = new FileOutputStream(copiedImage)) {

            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = f.read(buffer)) != -1) {
                o1.write(buffer, 0, bytesRead);
            }

            System.out.println("Image copied successfully from " + originalImage + " to " + copiedImage);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
