
public class TestaValores {
public static void main(String[] args) {
	Conta conta = new Conta(1337,2442);
	
	System.out.println(conta.getAgencia());
	
	Conta conta1 = new Conta(1010, 2563);
	Conta conta2 = new Conta(1534, 1089);
	
	System.out.println(conta.getTotal());
}
}
