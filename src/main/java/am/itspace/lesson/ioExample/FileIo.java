package am.itspace.lesson.ioExample;

import java.io.*;

public class FileIo {


    public static void main(String[] args) throws IOException {
        String[] names = {"A", "B", "g"};
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Ando\\IdeaProjects\\repetitionOOP\\src\\main\\java\\am\\itspace\\lesson\\ioExample\\output.txt"));
            writer.write("Writing to a file ");
            writer.write("\n Here is another line ");
            for (String name : names) {
                writer.write("\n " + name);
            }
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Ando\\IdeaProjects\\repetitionOOP\\src\\main\\java\\am\\itspace\\lesson\\ioExample\\output.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
