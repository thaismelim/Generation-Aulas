package Classes;

public class Preguica extends Animal {
	
	public Preguica() {
	}
    public Preguica (String nome, int idade){
    	 super(nome, idade);
   	}
	public void subirEmArvores(){
		 System.out.println("Subindo ... !\n");
    }
    public void emitirSom(){
        System.out.println("Desconhecido");
    }
}