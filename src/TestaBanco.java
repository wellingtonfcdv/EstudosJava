
public class TestaBanco {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.nome = "Wellington";
		cliente.cpf = "11155522211";
		cliente.profissao = "Programador";
		
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.deposita(100);
		
		contaDoPaulo.titular = cliente;
		System.out.println(contaDoPaulo.titular.nome);
		System.out.println(contaDoPaulo.titular);
	}
}
