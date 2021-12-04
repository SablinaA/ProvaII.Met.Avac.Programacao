package fabrica;

import classeMain.Capa;
import classeMain.Edicao;
import tipoDeLivros.CapaComum;
import tipoDeLivros.EdicaoComum;

public class LivroComum extends LivroFactory {

	
	public Edicao escolherEdicao() {
		System.out.println("Criando livro comum");
		
		 return new EdicaoComum();
		
		 
		
	}

	@Override
	public Capa escolherCapa() {
		return new CapaComum();
	}

}
