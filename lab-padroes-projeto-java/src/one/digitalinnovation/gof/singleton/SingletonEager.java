package one.digitalinnovation.gof.singleton;

/**
 * Singleton "apressado".
 * @author Ludymila
 *
 */

public class SingletonEager {
	

	private static SingletonEager instancia = new SingletonEager();//* Ele é apressado já instância o q ele precisa devolver*//
	private SingletonEager() {
	super();
	}
	
	//* só quando ela for igual a null que instanciamos ela, é basicamente o que fizemos abaixo*//
	public static SingletonEager getInstancia() {
	
	return instancia;
}

}
