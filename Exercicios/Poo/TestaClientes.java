package com.generation.clientes;

import com.generation.clientes.model.Clientes;

public class TestaClientes {
	
	public static void main(String[] args) {
		
		Clientes c1 = new Clientes(01, "478596123-3", "Luis Guerreiro", "Praia", "luis_bora_meu_povo@generation.com.br", 912345678);
		
		c1.visualizar();
	}

}
