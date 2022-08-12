package Aviao;

public class ObjetoAviao {
	
	
	public static void main(String[] args) {
		
	Aviao Av1 = new Aviao("Boeing","String","Azul","2018",false);
	Av1.modelo = "Boeing";
	Av1.marca = "String";
	Av1.cor = "Azul";
	Av1.ano = "2018";
	Av1.status();
	Av1.ligar();
		
	
}	
}
