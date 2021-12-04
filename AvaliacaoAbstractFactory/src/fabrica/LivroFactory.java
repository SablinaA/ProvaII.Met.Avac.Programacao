package fabrica;

import classeMain.Capa;
import classeMain.Edicao;

public abstract class LivroFactory {
	
	public abstract Edicao escolherEdicao();
	
	public abstract Capa escolherCapa();

}
