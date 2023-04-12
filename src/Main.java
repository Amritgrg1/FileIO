import java.io.*;

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
            fileWriter.write("this is a test 1\n");
            fileWriter.write("this is a test 2\n");
            fileWriter.write("this is a test 3");
            fileWriter.close();
            System.out.println("success on writing to files");
        } catch(IOException e){
            throw new RuntimeException(e);
        }
        //reading from the file
//        try{
//            FileReader fileReader = new FileReader(file);
//           int c= fileReader.read();
//            while(c!=-1) {
//                System.out.print((char)c);
//                c= fileReader.read();
//            }
//        } catch (IOException e){
//            throw new IOException(e);
//        }

        //Bufferreader
        try{
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String c = bufferedReader.readLine();
            while(c!=null) {
                System.out.println(c);
                c = bufferedReader.readLine();
            }
        } catch(IOException e){
            throw new IOException(e);
        }

    }
}