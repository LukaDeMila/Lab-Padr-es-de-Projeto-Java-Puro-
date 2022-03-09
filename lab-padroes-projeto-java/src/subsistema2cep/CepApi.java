package subsistema2cep;
public class CepApi {
    
	private static CepApi instancia = new CepApi();//* Ele � apressado j� inst�ncia o q ele precisa devolver*//
	private CepApi() {
	super();
	}
	
	//* s� quando ela for igual a null que instanciamos ela, � basicamente o que fizemos abaixo*//
	public static CepApi getInstancia() {
	
	return instancia;
}
	
	//*Aqui eu posso criar um m�todo p�blico, porque quem for querer usar vai pegar vai tr acesso a inst�ncia do singleton*//
	public String recuperarCidade(String Cep) {
		return "Luis Eduardo Magalh�es";
}
	public String recuperarEstado(String Cep) {
		return "BA";
}
}



	
