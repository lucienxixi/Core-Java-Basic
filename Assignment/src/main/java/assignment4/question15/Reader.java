package assignment4.question15;

import java.io.BufferedReader;
import java.io.FileReader;

public class Reader implements Runnable{
    String fileString;

    public synchronized String readTextFile(String fileName) {
        String string = "";
        String thisLine = null;

        try {
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            while((thisLine = br.readLine()) != null) {
                string += thisLine + "\n";
            }
            br.close();

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return string;
    }

    @Override
    public void run() {
        fileString = readTextFile("src/main/java/assignment4/question15/input.txt");
    }
}
