package Controller;

public class FracaoController {

	public FracaoController() {
		super();
	}

	public double fracaoSoma (int num) {
		double soma = 0;
		if (num == 1) {
			return 1;
		} else {
			soma = soma + (1/(double)num);
			return soma + fracaoSoma(num -1) ;
		}
	}
}

	