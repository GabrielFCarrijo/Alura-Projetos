package java_io.src;

import java.io.File;
import java.util.Scanner;

public class Teste {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(new File("contas.csv"));

        while (sc.hasNextLine()){

            String linha = sc.nextLine();
            System.out.println(linha);
        }
        sc.close();
    }
}
