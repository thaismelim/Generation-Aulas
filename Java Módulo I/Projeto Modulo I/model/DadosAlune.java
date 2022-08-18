

package com.academia.sistema.model;

import java.util.Scanner;

//DadosAlune
public class DadosAlune {

	public DadosAlune(String nome, int genero, int idade, double peso, int objetivo, int funcao, String cpf, int senha,
			int menu) {
		super();
		this.nome = nome;
		this.genero = genero;
		this.idade = idade;
		this.peso = peso;
		this.objetivo = objetivo;
		this.funcao = funcao;
		this.cpf = cpf;
		this.senha = senha;
		this.menu = menu;
	}

	String usuario;
	int senhaUser;

	Scanner leia = new Scanner(System.in);

	public DadosAlune(int menu) {
		this.menu = menu;
	}

	public DadosAlune() {
		// TODO Auto-generated constructor stub
	}

	public void cadastroMenu() {
		System.out.println("***********************************");
		System.out.println("***********************************");
		System.out.println("Dados do Usuario");
		System.out.println("***********************************");
		System.out.println("***********************************");
		System.out.println("Nome: " + this.nome);
		System.out.println("Gênero: " + this.genero);
		System.out.println("Idade: " + this.idade);
		System.out.println("Peso: " + this.peso);
		System.out.println("Objetivo: " + this.objetivo);
		System.out.println("Função: " + this.funcao);
		System.out.println("CPF: " + this.cpf);
		System.out.println("Senha: " + this.senha);
	}

	public void primeiroAcesso() {

		System.out.println("Entre com seu nome: ");
		this.nome = leia.next();
		System.out.println("Entre com seu Gênero: (1)Feminino (2)Masculino (3)Não binário");
		this.genero = leia.nextInt();
		verificarIdade();
		System.out.println("Entre com seu peso: ");
		this.peso = leia.nextDouble();
		System.out.println("Entre com sua altura: ");
		this.altura = leia.nextDouble();
		System.out.println("Entre com sua função (1)Alune (2)Instrutor: ");
		this.funcao = leia.nextInt();
		System.out.println("Entre com seu cpf: (Digite apenas números)");
		this.cpf = leia.next();
		System.out.println("Entre com sua senha: ");
		this.senha = leia.nextInt();
		login();

	}

	public void verificarIdade() {
		do {
			System.out.println("\nEntre com sua Idade: ");
			idade = leia.nextInt();
			if (idade < 18) {
				System.out.println("Você é menor de idade, não pode acessar o programa!");
			}
		} while (idade < 18);
	}

	public void login() {
		System.out.println("\nEntre com seu CPF: ");
		usuario = leia.next();
		System.out.println("\nEntre com a sua senha: ");
		senhaUser = leia.nextInt();

		// Equals: compara o conteúdo da String.
		if (usuario.equals(cpf) && senhaUser == senha) { // == só serve para números
			loginAluneCadastrado();
		} else {
			System.out.println("\nLogin ou senha incorretos.");
			login();
		}
	}

	public void loginAluneCadastrado() {
		if (usuario.equals(cpf) && senhaUser == senha) {
			CalculoIMC();
		} else {
			System.out.println("\nLogin ou senha incorretos.");
			login();
		}
	}

	public void CalculoIMC() {

		imc = peso / (Math.pow(altura, 2));

		System.out.printf("\nO resultado do IMC foi de: %.2f %%", imc);
		if (imc < 18.5) {
			System.out.println("\nVocê está abaixo do peso!");
		} else if (imc >= 18.6 && imc <= 24.99) {
			System.out.println("\nVocê está com peso normal!");
		} else {
			System.out.println("\nVocê está acima do peso!");
		}
		ObjetivoFinal();

	}

	public void ObjetivoFinal() {
		if (genero == 1) {
			if (idade >= 18 && idade <= 30) {
				tmb = (peso * 14.818) + 486.6;
			}
			if (idade >= 31 && idade <= 60) {
				tmb = (peso * 8.126) + 845.6;
			}
			System.out.printf("\nO resultado da Taxa Metabólica é de: %.0f calorias por dia!", tmb);
		} else if (genero == 2) {
			if (idade >= 18 && idade <= 30) {
				tmb = (peso * 15.057) + 692.2;
			}
			if (idade >= 31 && idade <= 60) {
				tmb = (peso * 11.472) + 873.1;
			}
			System.out.printf("\nO resultado da Taxa Metabólica é de: %.0f calorias por dia!\n", tmb);
		}
		objetivoEscolhido();
	}

	public void objetivoEscolhido() {
		do {
			System.out.println("\n");
			System.out.println("\nEntre com seu objetivo (1)Manter (2)Perda (3)Ganho: ");
			this.objetivo = leia.nextInt();
			switch (objetivo) {
			case 1:
				System.out.println("Exercícios para manter massa muscular\\r\\n"
						+ "\n1 - Caminhada de baixa intensidade por 10 minutos;\r\n" + "2 - Aulas de yoga;\r\n"
						+ "3 - Alongamentos;\r\n" + "4 - Pilates.");

				System.out.printf("\nPara manter seu peso em manutenção, consuma %.0f calorias por dia!\n", tmb);
				break;
			case 2:
				resultado = tmb - 500;
				System.out.println("\n");
				System.out.println("Exercícios para perder massa muscular\r\n" + "\n1 - Uma hora de bicicleta \r\n"
						+ "2 - Uma hora de esteira em velocidade intensa		\r\n" + "3 - Uma hora natação");
				System.out.printf("\nPara entrar em déficit calórico, consuma %.0f calorias por dia!\n", resultado);
				break;
			case 3:
				resultado = tmb + 500;
				System.out.println("\nExercícios para ganhar massa muscular\r\n" + "\n1 - Levantamento de peso.\r\n"
						+ "2 - Treinamento suspenso ou TRX\r\n" + "3 - Funcional\r\n" + "4 - Boxe");
				System.out.printf("\nPara ganho de massa, consuma %.0f calorias por dia!\n", resultado);
				break;

			default:
				System.out.printf("Você digitou uma opção inválida!");
			}
		} while (objetivo > 3);
		CalculoTMB();
	}

	public void CalculoTMB() {
		if (objetivo == 1) {
			proteina = (tmb * 40) / 100;
			gordura = (tmb * 40) / 100;
			carbo = (tmb * 20) / 100;
			System.out.printf("\n%.0f gramas proteina;", proteina);
			System.out.printf("\n%.0f gramas gordura;", gordura);
			System.out.printf("\n%.0f gramas carboidrato.\n", carbo);
		} else if (objetivo == 2) {
			proteina = (resultado * 40) / 100;
			gordura = (resultado * 40) / 100;
			carbo = (resultado * 20) / 100;
			System.out.printf("\n%.0f gramas proteina;", proteina);
			System.out.printf("\n%.0f gramas gordura;", gordura);
			System.out.printf("\n%.0f gramas carboidrato.\n", carbo);
		}

		else if (objetivo == 3) {
			proteina = (resultado * 40) / 100;
			gordura = (resultado * 40) / 100;
			carbo = (resultado * 20) / 100;
			System.out.printf("\n%.0f gramas proteina;", proteina);
			System.out.printf("\n%.0f gramas gordura;", gordura);
			System.out.printf("\n%.0f gramas carboidrato.\n", carbo);
		}

		System.out.println("\n\nAgradecemos por utilizar o nosso programa!");

	}

	public void setMenu(int menu) {
		this.menu = menu;
	}

	public String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getGenero() {
		return genero;
	}

	public void setGenero(int genero) {
		this.genero = genero;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getObjetivo() {
		return objetivo;
	}

	public void setObjetivo(int objetivo) {
		this.objetivo = objetivo;
	}

	public int getFuncao() {
		return funcao;
	}

	public void setFuncao(int funcao) {
		this.funcao = funcao;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public DadosAlune(double resultado) {
		super();
		this.resultado = resultado;
	}

	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}

	public double getTmb() {
		return tmb;
	}

	public void setTmb(double tmb) {
		this.tmb = tmb;
	}

	public int genero;

	public int idade;

	public double peso;

	public double altura;

	public double imc;

	public int objetivo;

	public int funcao;

	public String cpf;

	public int senha;

	public int menu;

	public double tmb;

	public double resultado;

	public double gordura;

	public double proteina;

	public double carbo;

}

