package Polimorfismo.br.com.byteBank.teste;

import Polimorfismo.br.com.byteBank.modelo.Conta;
import Polimorfismo.br.com.byteBank.modelo.ContaCorrente;
import Polimorfismo.br.com.byteBank.modelo.ContaPoupanca;

public class TesteArrayReferencias {

    public static void main(String[] args) {


        Conta[] contas = new Conta[5];

        ContaCorrente cc1 = new ContaCorrente(22, 11);
        contas[0] = cc1;

        ContaPoupanca cc2 = new ContaPoupanca(22, 22);
        contas[1] = cc2;

        ContaCorrente ref = (ContaCorrente) contas[0];
        System.out.println(ref.getNumero());

        System.out.println(contas[1].getNumero());


    }
}
