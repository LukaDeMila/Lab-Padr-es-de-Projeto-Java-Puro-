package subsistema1.crm;

public class CrmService {
// esse gravar cliente poderia ter várias coisas como cep, estado*//
	
	private CrmService() {
		// TODO Auto-generated constructor stub
	}
	public static void gravarCliente(String nome, String cep, String cidade, String Estado) {
		System.out.println("Cliente salvo no sistema de CRM.");
		System.out.println(nome);
		System.out.println(cep);
		System.out.println(cidade);
		System.out.println(Estado);
}

	
}
