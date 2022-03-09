package one.digitalinnovation.gof.facade;

import subsistema1.crm.CrmService;
import subsistema2cep.CepApi;

//* Facade promove uma interface que reduza a complexidade nas integrações com subsistemas*//
//* que ela seja simples *//
	public class Facede {


	//* vou deixar claro que eu quero fazer uma migração com subsistema externo*//
	public void migrarCliente(String nome, String cep) {
	
		String cidade = CepApi.getInstancia().recuperarCidade(cep);
		String estado = CepApi.getInstancia().recuperarEstado(cep);
		
		CrmService.gravarCliente(nome, cep, cidade, estado);
}
}