package Polimorfismo.br.com.byteBank.util;

import Polimorfismo.br.com.byteBank.modelo.Conta;
import Polimorfismo.br.com.byteBank.modelo.ContaCorrente;

import java.util.ArrayList;

public class TesteArrayList {

    public static void main(String[] args) {

        ArrayList<Conta> list = new ArrayList<Conta>();

        Conta cc = new ContaCorrente(22, 11);
        list.add(cc);

        Conta cc2 = new ContaCorrente(22, 31);
        list.add(cc2);

        System.out.println(list.size());
        Conta ref = (Conta) list.get(0);
        System.out.println(ref.getNumero());

        list.remove(0);

        Conta cc3 = new ContaCorrente(22, 31);
        list.add(cc3);

        for (int i = 0; i < list.size(); i++){

            System.out.println(list.get(i));
        }

        for (Object o : list){
            System.out.println(o);
        }
    }
}
