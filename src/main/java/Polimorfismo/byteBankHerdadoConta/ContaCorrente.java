package Polimorfismo.byteBankHerdadoConta;

import OrientadoAObjetos.CursoOrientadoAObjetos.bytebank.src.byteBank.Conta;

//new Polimorfismo.byteBankHerdadoConta.ContaCorrente()
public class ContaCorrente extends Conta implements Tributavel {

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public boolean saca(double valor) {
		double valorASacar = valor + 0.2;
		super.saca(valorASacar);
		return false;
	}

	@Override
	public void deposita(double valor) {
        super.saldo += valor;
    }

	@Override
	public double getValorImposto() {	
		return super.saldo * 0.01;
	}
	
}
