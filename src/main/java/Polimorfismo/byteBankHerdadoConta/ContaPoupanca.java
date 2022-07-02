package Polimorfismo.byteBankHerdadoConta;

import OrientadoAObjetos.CursoOrientadoAObjetos.bytebank.src.byteBank.Conta;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;	
	}
	
}
