package java_io.src;

import java.io.*;

public class TesteEscritaPrintStreamPrintWriter {

    public static void main(String[] args) throws IOException {

        PrintStream printStream = new PrintStream("C:\\Users\\Gabriel\\Desktop\\Alura-Projetos-Java\\src\\main\\java\\java_io\\src\\lorem.txt");
        PrintWriter printWriter = new PrintWriter("C:\\Users\\Gabriel\\Desktop\\Alura-Projetos-Java\\src\\main\\java\\java_io\\src\\lorem.txt");

        printWriter.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
        printWriter.print("tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam");

        printStream.close();
    }
}
