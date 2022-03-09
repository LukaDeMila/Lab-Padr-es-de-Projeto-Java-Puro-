package one.digitalinnovation.gof.singleton;

/**
 * Singleton "apressado".
 * @author Ludymila
 *
 */

public class SingletonEager {
	

	private static SingletonEager instancia = new SingletonEager();//* Ele � apressado j� inst�ncia o q ele precisa devolver*//
	private SingletonEager() {
	super();
	}
	
	//* s� quando ela for igual a null que instanciamos ela, � basicamente o que fizemos abaixo*//
	public static SingletonEager getInstancia() {
	
	return instancia;
}

}
