package teste;

import classeMain.Livro;
import fabrica.GerarLivroFactory;

public class TesteAplicacao extends GerarLivroFactory{
	

		public static void main(String[] args) {
			
				Livro l1 = criarLivro("comum");
				System.out.println(l1);
				
			

		}

	}



