package java_io.src;

import java.io.*;
import java.net.Socket;

public class TesteCopia_Escrita {

    public static void main(String[] args) throws IOException {

        Socket socket = new Socket();

        InputStream fis =  socket.getInputStream(); //new FileInputStream("C:\\Users\\Gabriel\\Desktop\\Alura-Projetos-Java\\src\\main\\java\\java_io\\src\\lorem.txt");
        InputStreamReader inputStreamReader = new InputStreamReader(fis);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        OutputStream out = socket.getOutputStream(); //new FileOutputStream("C:\\Users\\Gabriel\\Desktop\\Alura-Projetos-Java\\src\\main\\java\\java_io\\src\\lorem2.txt");
        Writer outputStreamWriter = new OutputStreamWriter(out);
        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
        
        String linha = bufferedReader.readLine();

        while (linha != null && linha.isEmpty()) {
            bufferedWriter.write(linha);
            bufferedWriter.newLine();
            bufferedWriter.flush();
            linha = bufferedReader.readLine();
        }
        bufferedReader.close();
        bufferedWriter.close();
    }
}
