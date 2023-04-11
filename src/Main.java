import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("Amrit.txt");
        try{
            file.createNewFile();
            System.out.println("New File created..");
        } catch (IOException e) {
            System.out.println("File cannot be created..");
            throw new RuntimeException(e);
        }

        // write inside file
        try{
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("this is a test\n");
            fileWriter.write("this is a test\n");
            fileWriter.write("this is a test");
            fileWriter.close();
            System.out.println("success on writing to files");
        } catch(IOException e){
            throw new RuntimeException(e);
        }
        //reading from the file
        try{
            FileReader fileReader = new FileReader(file);
           int c= fileReader.read();
            while(c!=-1) {
                System.out.print((char)c);
                c= fileReader.read();
            }
        } catch (IOException e){
            throw new IOException(e);
        }

    }
}