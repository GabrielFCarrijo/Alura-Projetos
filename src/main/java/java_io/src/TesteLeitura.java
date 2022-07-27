package java_io.src;

import java.io.*;

public class TesteLeitura {

    public static void main(String[] args) throws IOException {

        // Fluxo de Entrada com Arquivo

        FileInputStream fis = new FileInputStream("lorem.txt");
        InputStreamReader inputStreamReader = new InputStreamReader(fis);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String linha = bufferedReader.readLine();

        System.out.println(linha);

        bufferedReader.close();
    }
}
