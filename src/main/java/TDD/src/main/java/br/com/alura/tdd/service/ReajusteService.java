package TDD.src.main.java.br.com.alura.tdd.service;

import java.math.BigDecimal;

import TDD.src.main.java.br.com.alura.tdd.modelo.Desempenho;
import TDD.src.main.java.br.com.alura.tdd.modelo.Funcionario;

public class ReajusteService {

	public void concederReajuste(Funcionario funcionario, Desempenho desempenho) {
		BigDecimal reajuste = desempenho.percentualReajuste();
		funcionario.reajustarSalario(reajuste);
	}

}
