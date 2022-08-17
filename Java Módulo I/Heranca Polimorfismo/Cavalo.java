package Classes;

public class Cavalo extends Animal {

    public Cavalo(){
    }
    public Cavalo(String nome, int idade){
        super(nome, idade);
    }
    public void trotar(){
        System.out.println("Cavalo trotando!\n");
    }
    public void emitirSom(){
        System.out.println("Relincha" );
    }
}