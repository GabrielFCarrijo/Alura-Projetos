package Polimorfismo.br.com.byteBank.teste;

import java.io.*;

public class TesteSerializacao {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
//
//        Cliente cliente = new Cliente();
//        cliente.setNome("Gabriel");
//        cliente.setCpf("789456123");
//        cliente.setProfissao("Dev");

//        ObjectOutputStream ois =  new ObjectOutputStream(new FileOutputStream("client.bin"));
//        ois.writeObject(cliente);
//        ois.close();

        ObjectInputStream oos = new ObjectInputStream(new FileInputStream("client.bin"));
        Cliente cliente = (Cliente) oos.readObject();
        oos.close();

        System.out.println(cliente.getCpf());
    }
}
