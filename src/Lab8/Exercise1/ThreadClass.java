package Lab8.Exercise1;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ThreadClass extends Thread{
    FileInputStream fIn;
    FileOutputStream fOut;

    public ThreadClass(FileInputStream fIn, FileOutputStream fOut) {
        super();
        this.fIn = fIn;
        this.fOut = fOut;
    }

    public void run() {
        int a = 0;
        int ct = 0;
        try {
            while (!((a = fIn.read()) < 0)) {
                char c = (char) a;
                fOut.write(c);
                ct += 1;
                if (ct == 10) {
                    System.out.println("10 characters are copied");
                    ct = 0;
                    Thread.sleep(5000);
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}