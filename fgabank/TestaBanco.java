package fgabank;

public class TestaBanco {

	public static void main(String[] args) {

//	Pessoa pessoaNumero1 = new Pessoa();//criar uma instacia =copia	
//	pessoaNumero1.nome ="Jos� das Couves";
//	pessoaNumero1.profissao ="Agricultor";
//	pessoaNumero1.cpf ="617.769.291-52";
//	
//	
//	pessoaNumero1.rg = "sgdhuiagdau";
//	
//	
//	System.out.println("Nome: " + pessoaNumero1.nome);
//	System.out.println("Profiss�o: "+ pessoaNumero1.profissao);
//	System.out.println("CPF: " + pessoaNumero1.cpf);
//	
//	Pessoa pessoaNumero2 = pessoaNumero1;
//	pessoaNumero2.nome = "Jo�o dos Tomates";
//	
//	System.out.println("==================");
//	
//	System.out.println("Nome: " +pessoaNumero1.nome);
//	System.out.println("Nome: " +pessoaNumero2.nome);

// Pessoa pessoaNova = new Pessoa();//Instanciar a classe Pessoa
// pessoaNova.setNome("Jose das Couves");
// System.out.println("Nome: "+ pessoaNova.getNome());

// Pessoa pessoaComConstrutor1 = new Pessoa("Jo�o dos Tomates", "611.996.052-04","44.977.771-6");

// System.out.println("Nome: " + pessoaComConstrutor1.getNome());
// System.out.println("CPF: " + pessoaComConstrutor1.getCpf());
// System.out.println("RG: " + pessoaComConstrutor1.getRg());

		Conta conta1 = new Conta();
		conta1.setAgencia(1234);
		conta1.setnumeroConta(7889);
		//conta1.setSaldo(1000000.50);>> n�o se deve alterar diretamente essa informa��o.Ela apenas pode ser exibida
		conta1.setTitular("VivianeMayumi");
		
		conta1.depositar(100000.0);
		
		System.out.println("Agencia: " + conta1.getAgencia());
		System.out.println("Conta: " + conta1.getnumeroConta());
		System.out.println("Titular: " + conta1.getTitular());
		System.out.printf("Saldo Atual:R$ %.2f\n",conta1.getSaldo());
		
		conta1.sacar(20.0);
		if (conta1.sacar(20.0)) {
			System.out.println("Saque efetuado com sucesso!");
		}else {
			System.out.println("Verifique valor do saque!");
		}
			
		System.out.printf("Saldo Atual:R$ %.2f\n ",conta1.getSaldo());
		
		Conta conta2 = new Conta();
		conta2.setAgencia(5582);
		conta2.setnumeroConta(2234);
		
		conta1.transferir(10000.0, conta2);
		System.out.printf("Saldo Atual Flavia:R$ %.2f\n ",conta1.getSaldo());
		System.out.printf("Saldo Atual Babakuxy:R$ %.2f\n ",conta2.getSaldo());
		
	}

}