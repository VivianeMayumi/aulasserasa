package fgabank;

public class PessoaHeranca {

	private String nome;
	private String telefone;
	private String email;

	public PessoaHeranca() {
		// metodo construtor default=preenchimento dos atributos � opcional
	}

	public PessoaHeranca(String nome, String telefone, String email) {
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
	}

	public String getNome() {// exibe os objetos
		return nome;
	}

	public void setNome(String nome) {// grava os objetos nos atributos
		this.nome = nome;

	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;

	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;

	}

}
