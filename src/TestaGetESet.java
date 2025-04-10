
public class TestaGetESet {
public static void main(String[] args) {
	Conta conta = new Conta();
	
	conta.setNumero(1337);
	System.out.println(conta.getNumero());
	
	Cliente wellington = new Cliente();
	
	conta.setTitular(wellington);
	wellington.setNome("Wellington Feijó"); 
	
	conta.setTitular(wellington);
	
	System.out.println(conta.getTitular().getNome());
	
	conta.getTitular().setProfissao("programador");
}
}
