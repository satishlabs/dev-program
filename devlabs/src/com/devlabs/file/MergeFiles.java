package com.devlabs.file;

import java.io.*;

public class MergeFiles {
    public static void main(String[] args) {
        File file1 = new File("H:\\File\\file1.txt");
        File file2 = new File("H:\\File\\file2.txt");
        File outputFile = new File("H:\\File\\merged_output.txt");

        try (
            BufferedReader reader1 = new BufferedReader(new FileReader(file1));
            BufferedReader reader2 = new BufferedReader(new FileReader(file2));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))
        ) {
            // Read from file1
            String line;
            while ((line = reader1.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            // Read from file2
            while ((line = reader2.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            System.out.println("Files merged successfully into: " + outputFile.getAbsolutePath());

        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

