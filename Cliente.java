package POO;

public class Cliente {

	
	private String nomeCliente;
	private String endereco;
	private String cep;
	private String telefone;
	private String cpf;
	
	public Cliente(String nomeCliente, String endereco, String cep, String telefone, String cpf) {
		super();
		this.nomeCliente = nomeCliente;
		this.endereco = endereco;
		this.cep = cep;
		this.telefone = telefone;
		this.cpf = cpf;
	
	}
	
	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeClienete(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}
 
	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void imprimirInfo() {
		System.out.println(nomeCliente +" mora na  "+endereco+
				" no cep: " +cep+ " telefone: " +telefone+ " e cpf: " +cpf);
	
	
}
}
	
	
	
	
	
