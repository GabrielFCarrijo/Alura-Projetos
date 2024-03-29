package Polimorfismo.br.com.byteBank.teste.io;

import Polimorfismo.br.com.byteBank.modelo.ContaCorrente;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TesteDescerializacao {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream( new FileInputStream("cc.bin"));
        ContaCorrente cc = (ContaCorrente) ois.readObject();

        ois.close();

        System.out.println(cc.getSaldo());
        System.out.println(cc.getTitular());
    }
}
