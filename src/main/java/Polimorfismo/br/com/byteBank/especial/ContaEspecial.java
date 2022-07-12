package Polimorfismo.br.com.byteBank.especial;

import OrientadoAObjetos.bytebank.src.byteBank.Conta;

public class ContaEspecial extends Conta {

    public ContaEspecial(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void deposita(double valor){

        super.saldo += valor;
    }
}
