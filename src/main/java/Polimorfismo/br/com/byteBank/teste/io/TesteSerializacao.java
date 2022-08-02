package Polimorfismo.br.com.byteBank.teste.io;

import Polimorfismo.br.com.byteBank.modelo.Cliente;
import Polimorfismo.br.com.byteBank.modelo.ContaCorrente;
import Polimorfismo.br.com.byteBank.modelo.ContaPoupanca;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TesteSerializacao {

    public static void main(String[] args) throws IOException {

        Cliente cliente = new Cliente();
        cliente.setNome("Gabriel");
        cliente.setCpf("789456123");
        cliente.setProfissao("Dev");

        ContaCorrente cc = new ContaCorrente(112,222);
        cc.setTitular(cliente);
        cc.deposita(222);


        ObjectOutputStream ois =  new ObjectOutputStream(new FileOutputStream("cc.bin"));
        ois.writeObject(cliente);
        ois.close();
    }
}
