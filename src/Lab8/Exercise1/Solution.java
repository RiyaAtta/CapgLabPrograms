package Lab8.Exercise1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        File input = new File("source.txt");
        File output = new File("target.txt");

        FileInputStream fIn = new FileInputStream(input);
        FileOutputStream fOut = new FileOutputStream(output);
        ThreadClass th = new ThreadClass(fIn, fOut);
        th.run();
    }
}
