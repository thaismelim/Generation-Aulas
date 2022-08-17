package Classes;

public class Teste {

	  public static void main(String[] args) {

	        
	        Animal cavalo = new Cavalo("Black", 10);
	        Animal cachorro = new Cachorro("Bob", 18);
	        Animal preguica = new Preguica("Zoraide", 20);

	        cavalo  = new Cavalo("Black", 10);
	        System.out.println("Nome do Cavalo: " + cavalo.getNome());
			System.out.println("Idade: " + cavalo.getIdade());
			cavalo.emitirSom();
			cavalo.trotar();
			
			System.out.println("*************************************");
			
			cachorro = new Cachorro ("Bob",18);
			System.out.println("Nome do Cachorro: " + cachorro.getNome());
			System.out.println("Idade: " + cachorro.getIdade());
			cachorro.emitirSom();
			cachorro.farejar();
			
			System.out.println("*************************************");
			
			preguica = new Preguica("Zoraide",20);
			System.out.println("Nome do Preguiça: " + preguica.getNome());
			System.out.println("Idade: " + preguica.getIdade());
			preguica.emitirSom();
			preguica.subirEmArvores();
	        
			
			
	    }
	        }
	