package aula7;

public class Pessoa {
	
	String nome;
	int idade;
	int cpf;
	

	public Pessoa(String nome, int idade, int cpf) {
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		
		
	}
	
	public Pessoa() {
		// TODO Auto-generated constructor stub
	}
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	

	public static void main(String args[]) {

		Pessoa p1 = new Pessoa("Fulano",20,1111111);
		Pessoa p2 = new Pessoa();
		
		p2.setNome("Ciclano");
		p2.setIdade(30);
		p2.setCpf(22222222);
		System.out.println(p1.toString());
        System.out.println(p2.toString());
		
	}
}
