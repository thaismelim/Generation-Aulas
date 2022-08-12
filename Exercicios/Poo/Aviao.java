package Aviao;

public class Aviao {

	String modelo;
	String marca;
	String cor;
	String ano;
	boolean ligado;
	public Object tempo;
		
	public Aviao(String modelo, String marca, String cor, String ano, boolean ligado) {
		super();
		this.modelo = modelo;
		this.marca = marca;
		this.cor = cor;
		this.ano = ano;
		this.ligado = ligado;
	
	}
	public void status() {
		System.out.println("Modelo: "+this.modelo);
		System.out.println("Marca: " +this.marca);
		System.out.println("Cor: " +this.cor);
		System.out.println("Ano: " +this.ano);
		System.out.println("Está Ligado? " +this.ligado);

	}
	public void  ligar () {
	if (ligado)
			System.out.println("\nIREMOS INICIAR NOSSA DECOLAGEM, TENHAMOS UMA BOA VIAGEM! ....");
	else 
		System.out.println("\nERRO!!! NÃO POSSO DECOLAR ....");
		}
	
		
	public void  velocidade () {
		int velocidade = 0;
		velocidade ++;
	}
	public void  desacelerar () {
		int velocidade = 0;
		velocidade --;
	}
}