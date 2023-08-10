package POO;

public class PessoaFisica extends Cliente22{
	

	private String Rg;
	private String Cnh;
	
	public PessoaFisica (String nome, String endereco, String cep, String telefone, String cpf, String Rg, String Cnh) {
		super(nome,endereco,cep,telefone,cpf);
		
		this.Rg = Rg;
		this.Cnh = Cnh;
		
	}

	public String getRg() {
		return Rg;
	}

	public void setRg(String rg) {
		Rg = rg;
	}

	public String getCnh() {
		return Cnh;
	}

	public void setCnh(String cnh) {
		Cnh = cnh;
	}
	
	public void imprimirInfo() {
		
		System.out.println("\nNome da Pessoa Fisica: "+getNome()+"\nEndereco: "+getEndereco()+"\nCep: "+getCep()
		+"\ntelefone: "+getTelefone()+"\nCpf: "+getCpf()+ "\nRg: "+Rg+"\nCnh: "+Cnh);
		
		
	}
	
	
}
