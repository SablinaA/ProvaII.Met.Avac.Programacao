package fabrica;

import classeMain.Capa;
import classeMain.Edicao;
import tipoDeLivros.CapaDura;
import tipoDeLivros.EdicaoLimitada;

public class LivroLuxo extends LivroFactory{


	public Edicao escolherEdicao() {
		
		return new EdicaoLimitada();
	}

	
	public Capa escolherCapa() {
		
		return new CapaDura();
	}

}
