package fgabank;

public class PessoaJurídica extends PessoaHeranca {
	
	private String cnpj;
	private String segmento;
	private String responsavel;
	
	
	
	public PessoaJurídica() {//gcfs
		
	}
	
	public PessoaJurídica(String cnpj, String segmento, String responsavel) {//gcuf
		super();
		this.cnpj = cnpj;
		this.segmento = segmento;
		this.responsavel = responsavel;
	}
	
	public String getCnpj() {//ggas
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getSegmento() {
		return segmento;
	}
	public void setSegmento(String segmento) {
		this.segmento = segmento;
	}
	public String getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}
	
	
	
}
