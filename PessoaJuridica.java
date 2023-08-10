package POO;

public class PessoaJuridica extends Cliente22 {

	
	private String Cnpj;
	private String RazaoSocial;
	
	public PessoaJuridica (String nome, String endereco, String cep, String telefone, String cpf, String Cnpj, String RazaoSocial) {
		super(nome,endereco,cep,telefone,cpf);
		
		this.Cnpj = Cnpj;
		this.RazaoSocial = RazaoSocial;
		
	}

	public String getCnpj() {
		return Cnpj;
	}

	public void setCnpj(String cnpj) {
		Cnpj = cnpj;
	}

	public String getRazaoSocial() {
		return RazaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		RazaoSocial = razaoSocial;
	}
	
     public void imprimirInfo() {
		
		System.out.println("\nNome da Pessoa Juridica: "+getNome()+"\nEndereco: "+getEndereco()+"\nCep: "+getCep()
		+"\ntelefone: "+getTelefone()+"\nCpf: "+getCpf()+ "\nCnpj: "+Cnpj+"\nRazaoSocial: "+RazaoSocial);
		
     }
}
