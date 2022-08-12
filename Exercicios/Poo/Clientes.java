package com.generation.clientes.model;

public class Clientes {

	private int id;
	private String cpf;
	private String nome;
	private String endereço;
	private String email;
	private int telefone;
	
	
	public Clientes (int id, String cpf, String nome, String endereço, String email, int telefone) {
			
		this.id = id;
		this.cpf = cpf;
		this.nome = nome;
		this.endereço = endereço;
		this.email = email;
		this.telefone = telefone;
		
		
}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEndereço() {
		return endereço;
	}


	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getTelefone() {
		return telefone;
	}


	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

		public void visualizar() {
			System.out.println("Identificação do Cliente: " +this.id);
			System.out.println("CPF do Cliente: " +this.cpf);
			System.out.println("Nome do Cliente: " +this.nome);
			System.out.println("Endereço do Cliente: " +this.endereço);
			System.out.println("Email do Cliente: " +this.email);
			System.out.println("Telefone do Cliente: " +this.telefone);
		}
	
	
	

	
}	
	

