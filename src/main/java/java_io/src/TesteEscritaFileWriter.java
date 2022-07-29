package java_io.src;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWriter {

    public static void main(String[] args) throws IOException {

        FileWriter fileWriter = new FileWriter("C:\\Users\\Gabriel\\Desktop\\Alura-Projetos-Java\\src\\main\\java\\java_io\\src\\lorem.txt");
        BufferedWriter bufferedWriter =  new BufferedWriter(fileWriter);

        bufferedWriter.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
        bufferedWriter.newLine();
        bufferedWriter.write("tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam");

        bufferedWriter.close();
        fileWriter.close();
    }
}

