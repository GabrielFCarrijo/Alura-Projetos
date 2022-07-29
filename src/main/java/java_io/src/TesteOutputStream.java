package java_io.src;

import java.io.*;

public class TesteOutputStream {

    public static void main(String[] args) throws IOException {

        // Fluxo de Entrada com Arquivo

        OutputStream out = new FileOutputStream("C:\\Users\\Gabriel\\Desktop\\Alura-Projetos-Java\\src\\main\\java\\java_io\\src\\lorem.txt");
        Writer outputStreamWriter = new OutputStreamWriter(out);
        BufferedWriter bufferedReader = new BufferedWriter(outputStreamWriter);

        bufferedReader.write("é o brad");
        bufferedReader.newLine();


        bufferedReader.close();
    }
}
