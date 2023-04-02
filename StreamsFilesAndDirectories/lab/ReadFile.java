package advanced.StreamsFilesAndDirectories.lab;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {

        String programDir = System.getProperty("user.dir");

        String path = "input.txt";
//        String path = "C:\\Users\\User\\Desktop\\etc\\SoftUni\\Java Advanced\\Streams-Files-And-Directories\\" +
//                "04. Java-Advanced-Streams-Files-and-Directories-Resources\\" +
//                "04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        try{
            FileInputStream inputStream = new FileInputStream(path);

            int read = inputStream.read();

            while(read != -1){
                System.out.print(Integer.toBinaryString(read) + " ");
                read = inputStream.read();
            }

        }catch (IOException ignored){
        }
    }
}
