package io;

import java.io.*;

public class FileCopyBasic {
    public static void main(String[] args) {
        File source = new File("io/q1.txt");
        File destination = new File("io/q1.txt");

        if (!source.exists()) {
            System.out.println("Source file does not exist.");
            return;
        }

        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(destination)) {

            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
