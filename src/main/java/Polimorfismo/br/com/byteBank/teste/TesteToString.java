package Polimorfismo.br.com.byteBank.teste;

import Polimorfismo.br.com.byteBank.modelo.ContaCorrente;
import Polimorfismo.br.com.byteBank.modelo.ContaPoupanca;

public class TesteToString {

    public static void main(String[] args) {

        Object cc = new ContaCorrente(22,33);
        Object cp = new ContaPoupanca(22,33);

        System.out.println(cc);
        System.out.println(cp);
    }
}
