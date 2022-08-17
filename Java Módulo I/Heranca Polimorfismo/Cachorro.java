package Classes;

public class Cachorro extends Animal {

	
	public Cachorro(){
	}
	public Cachorro (String nome, int idade){
        super(nome, idade);
	}
	public void farejar(){
        System.out.println("Cachorro farejando!\n");
    }
    public void emitirSom(){
        System.out.println("Auau");
    }
}