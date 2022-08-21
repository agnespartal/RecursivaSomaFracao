package view;

import Controller.FracaoController;

public class Principal {

	public static void main(String[] args) {
		FracaoController fracao = new FracaoController();
		
		int num = 4;
		double resultado = fracao.fracaoSoma(num);
		System.out.println(resultado);
	}

}
