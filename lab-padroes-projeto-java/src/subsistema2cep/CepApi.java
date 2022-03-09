package subsistema2cep;
public class CepApi {
    
	private static CepApi instancia = new CepApi();//* Ele é apressado já instância o q ele precisa devolver*//
	private CepApi() {
	super();
	}
	
	//* só quando ela for igual a null que instanciamos ela, é basicamente o que fizemos abaixo*//
	public static CepApi getInstancia() {
	
	return instancia;
}
	
	//*Aqui eu posso criar um método público, porque quem for querer usar vai pegar vai tr acesso a instância do singleton*//
	public String recuperarCidade(String Cep) {
		return "Luis Eduardo Magalhães";
}
	public String recuperarEstado(String Cep) {
		return "BA";
}
}



	
