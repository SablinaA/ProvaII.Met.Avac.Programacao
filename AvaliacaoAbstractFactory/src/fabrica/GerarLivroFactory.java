package fabrica;

import classeMain.Livro;

public class GerarLivroFactory {
	
	protected static Livro criarLivro(String tipo) {
		
		LivroFactory lf = null;
		
		switch(tipo){
			case "comum":
				lf = new LivroComum();
				System.out.println("Criando livro comum");
				
			case "popular":
				lf = new LivroLuxo();	
				System.out.println("\nCriando livro de luxo");
		}
		
		Livro livro = new Livro();
		livro.setCapa(lf.escolherCapa());
		livro.setEdicao(lf.escolherEdicao());
	
		 return livro;}
	
	
	

}
