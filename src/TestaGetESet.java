
public class TestaGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta(123, 123);
		
		conta.setNumero(1337); 
		System.out.println(conta.getNumero());

		Cliente paulo = new Cliente();
		conta.setTitular(paulo);
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Programador");
		System.out.println(conta.getTitular().getProfissao());
		
	}

}
