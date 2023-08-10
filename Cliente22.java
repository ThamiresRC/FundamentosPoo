package POO;

public class Cliente22 {
	
	

	private String nome;
	private String endereco;
	private String cep;
	private String telefone;
	private String cpf;
	
	
	
	public Cliente22(String nome, String endereco, String cep, String telefone, String cpf) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.cep = cep;
		this.telefone = telefone;
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNomeClienete(String nome) {
		this.nome = nome;
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
		
		if(getCpf().length() != 11) {
			System.out.println(" Cpf invalido! ");
			
		}else{
			
			System.out.println(" Cpf valido! ");
		}
	}
	
	
	
	
	
	
	
	

}
