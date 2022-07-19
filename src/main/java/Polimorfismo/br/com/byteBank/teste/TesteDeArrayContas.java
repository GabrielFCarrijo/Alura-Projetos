package Polimorfismo.br.com.byteBank.teste;

import Polimorfismo.br.com.byteBank.modelo.Conta;
import Polimorfismo.br.com.byteBank.modelo.ContaCorrente;
import Polimorfismo.br.com.byteBank.modelo.GuardadorDeContas;

public class TesteDeArrayContas {

    public static void main(String[] args) {

        GuardadorDeContas guardadorDeContas = new GuardadorDeContas();

        Conta cc = new ContaCorrente(22,11);
        guardadorDeContas.adiciona(cc);

        Conta cc2 = new ContaCorrente(22,31);
        guardadorDeContas.adiciona(cc2);

        int tamanho = guardadorDeContas.getQuantidadeElementos();
        System.out.println(tamanho);

        Conta ref = guardadorDeContas.getReferencia(0);
        System.out.println(ref.getNumero());

        Conta ref2 = guardadorDeContas.getReferencia(1);
        System.out.println(ref2.getNumero());

    }
}
