package bytebank;

public class TestaMetodo {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.saldo = 100;
		conta.deposita(50);
		System.out.println(conta.saldo);
		
		boolean conseguiuRetirar =  conta.saca(20);
		System.out.println(conseguiuRetirar);
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		
		boolean sucessoTransferencia = contaDaMarcela.transfere(2300, conta);
		if(sucessoTransferencia) {
			System.out.println("Transferência com sucesso.");
		}else {
			System.out.println("Sem saldo.");
		}
		System.out.println(contaDaMarcela.saldo);
		System.out.println(conta.saldo);
	}
}
