package Polimorfismo.br.com.byteBank.util;

import Polimorfismo.br.com.byteBank.modelo.Conta;
import Polimorfismo.br.com.byteBank.modelo.ContaCorrente;

import java.util.ArrayList;

public class TesteArrayListEquals {

    public static void main(String[] args) {

        ArrayList<Conta> list = new ArrayList();

        Conta cc = new ContaCorrente(22, 11);
        list.add(cc);

        Conta cc2 = new ContaCorrente(22, 31);
        list.add(cc2);

        Conta cc3 = new ContaCorrente(22, 31);
        boolean exist = list.contains(cc3);

        System.out.println(exist);

        for (Conta conta : list) {
            if (conta.igual(cc3)){

                System.out.println("Já Tenho essa conta");
            }
        }



    }
}
