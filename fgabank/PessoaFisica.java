package fgabank;

public class PessoaFísica extends PessoaHeranca {
	
	private String cpf;
	private String rg;
	private String profissao;
	
	
	
	public PessoaFísica() {//gcfs
		super();
		
	}
	public PessoaFísica(String cpf, String rg, String profissao) {//gcuf
		super();
		this.cpf = cpf;
		this.rg = rg;
		this.profissao = profissao;
	}
	public String getCpf() {//ggas
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	

}
