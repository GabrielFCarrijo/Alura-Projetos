package Polimorfismo.br.com.byteBank.teste;

import Polimorfismo.br.com.byteBank.modelo.CalculadorDeImposto;
import Polimorfismo.br.com.byteBank.modelo.ContaCorrente;
import Polimorfismo.br.com.byteBank.modelo.SeguroDeVida;

/*
*	Classe representando um cliente no ByteBank
*
* 	@author Gabriel Carrijo
*	@version 0.1
*
* */

public class TesteTributaveis {

	public static void main(String[] args) {
		ContaCorrente cc= new ContaCorrente(222, 333);
		cc.deposita(100.0);
		
		SeguroDeVida seguro = new SeguroDeVida();
		
		CalculadorDeImposto calc = new CalculadorDeImposto();
		calc.registra(cc);
		calc.registra(seguro);
		
		System.out.println(calc.getTotalImposto());

	}

}
