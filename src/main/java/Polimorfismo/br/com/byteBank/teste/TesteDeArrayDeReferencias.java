package Polimorfismo.br.com.byteBank.teste;

import Polimorfismo.br.com.byteBank.modelo.Conta;
import Polimorfismo.br.com.byteBank.modelo.ContaCorrente;
import Polimorfismo.br.com.byteBank.modelo.GuardadorDeContas;
import Polimorfismo.br.com.byteBank.modelo.GuardadorDeReferencias;

public class TesteDeArrayDeReferencias {


    public static void main(String[] args) {

        GuardadorDeReferencias guardadorDeReferencias = new GuardadorDeReferencias();

        Conta cc = new ContaCorrente(22, 11);
        guardadorDeReferencias.adiciona(cc);

        Conta cc2 = new ContaCorrente(22, 31);
        guardadorDeReferencias.adiciona(cc2);

        int tamanho = guardadorDeReferencias.getQuantidadeElementos();
        System.out.println(tamanho);

        Conta ref = (Conta) guardadorDeReferencias.getReferencia(0);
        System.out.println(ref.getNumero());

    }
}