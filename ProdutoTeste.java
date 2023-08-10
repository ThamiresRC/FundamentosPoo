package POO;

public class ProdutoTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Produto adquirido = new Produto("Funkos","705","Harry Potter",2021,"250,00");
		Produto adquirido2 = new Produto("Console","Classico","DreamCast",1998,"2.500,00");
		
		adquirido.imprimirInfo();
		adquirido2.imprimirInfo();

	}

}
