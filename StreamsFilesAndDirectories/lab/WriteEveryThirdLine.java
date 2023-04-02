package StreamsFilesAndDirectories.lab;

import java.io.*;

public class WriteEveryThirdLine {
    public static void main(String[] args)throws IOException {

        String path = "input.txt";

        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(path)));
        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));

        String line = reader.readLine();

        int counter = 0;

        while (line != null){
            counter++;

            if(counter % 3 == 0){
                writer.write(line);
                writer.newLine();
            }
            line = reader.readLine();
        }
        reader.close();
        writer.close();
    }
}
