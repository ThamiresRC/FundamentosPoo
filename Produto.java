package POO;

public class Produto {

	private String nomeProduto;
	private String edicao;
	private String modelo;
	private int ano;
	private String preço;
	
	public Produto(String nomeProduto, String edicao, String modelo, int ano, String preço) {
		super();
		this.nomeProduto = nomeProduto;
		this.edicao = edicao;
		this.modelo = modelo;
		this.ano = ano;
		this.preço = preço;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getEdicao() {
		return edicao;
	}

	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getPreço() {
		return preço;
	}

	public void setPreço(String preço) {
		this.preço = preço;
	}
	
	public void imprimirInfo() {
		
		System.out.println(nomeProduto +" qual edicao? " +edicao+ " qual modelo? " +modelo+ " ano: " +ano+ " valor: "+preço);
	}
	
	

	
	
	
}
