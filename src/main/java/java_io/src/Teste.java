package java_io.src;

import java.io.File;
import java.util.Scanner;

public class Teste {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(new File("C:\\Users\\Gabriel\\Desktop\\Alura-Projetos-Java\\src\\main\\java\\java_io\\src\\contas.csv"));

        while (sc.hasNextLine()){

            String linha = sc.nextLine();
            System.out.println(linha);

            Scanner scanner = new Scanner(linha);
            scanner.useDelimiter(",");

            String valor1 = scanner.next();
            int valor2 = scanner.nextInt();
            double valor3 = scanner.nextDouble();

            System.out.println(valor1 + valor2 + valor3);


//          String[] valores = linha.split(",");
//          System.out.println(valores);
        }
        sc.close();
    }
}
