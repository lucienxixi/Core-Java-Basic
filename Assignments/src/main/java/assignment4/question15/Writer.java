package assignment4.question15;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Writer implements Runnable {
    String fileString;

    public synchronized void writeTextFile(String string, String fileName) {
        String[] array = string.split("\n");

        try {
            FileWriter fw = new FileWriter(fileName);
            BufferedWriter bw = new BufferedWriter(fw);

            for (String s : array) {
                if (!s.equals("")) {
                    s = Calculator.calculate(s);
                }
                bw.write(s);
                bw.newLine();
            }

            bw.flush();
            bw.close();

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        writeTextFile(fileString, "src/main/java/assignment4/question15/output.txt");
    }
}
