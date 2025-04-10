
public class TesteSacaNegativo {
public static void main(String[] args) {
	Conta conta = new Conta();
	System.out.println("Saldo >>>> " + conta.getSaldo());
	conta.deposita(100);
	System.out.println(conta.saca(201));
	
	System.out.println(conta.getSaldo());
		
}
}
