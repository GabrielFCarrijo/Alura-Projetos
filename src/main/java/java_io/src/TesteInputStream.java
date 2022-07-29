package java_io.src;

import java.io.*;

public class TesteInputStream {

    public static void main(String[] args) throws IOException {

        // Fluxo de Entrada com Arquivo

        FileInputStream fis = new FileInputStream("C:\\Users\\Gabriel\\Desktop\\Alura-Projetos-Java\\src\\main\\java\\java_io\\src\\lorem.txt");
        InputStreamReader inputStreamReader = new InputStreamReader(fis);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String linha = bufferedReader.readLine();

        while (linha != null) {
            System.out.println(linha);
            linha = bufferedReader.readLine();
        }
        bufferedReader.close();
    }
}
