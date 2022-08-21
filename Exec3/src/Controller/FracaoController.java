package Controller;

public class FracaoController {

	public FracaoController() {
		super();
	}

	public double fracaoSoma (int num) {
		double soma = 0;
		//condição de parada quando valor inicial chegar em 1
		if (num == 1) {
			return 1;
		} else {
			soma = soma + (1/(double)num);
			return soma + fracaoSoma(num -1);
			// soma da fração com o valor inicial decaindo a cada chamada até o 1
		}
	}
}

	
