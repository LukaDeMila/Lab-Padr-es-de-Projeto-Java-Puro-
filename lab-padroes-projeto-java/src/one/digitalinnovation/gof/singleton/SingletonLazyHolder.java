package one.digitalinnovation.gof.singleton;

/**
 * 
 * Singleton "Lazy Holder".
 * @author Ludymila 
 *
 */

public class SingletonLazyHolder {
	
	private static class InstanceHolder{//* fun��o de encapsular essa inst�ncia*//

	public static SingletonLazyHolder instancia = new SingletonLazyHolder();//* Ele � apressado j� inst�ncia o q ele precisa devolver*//
	}
	private SingletonLazyHolder() {
	
		super();
	}
	
	//* s� quando ela for igual a null que instanciamos ela, � basicamente o que fizemos abaixo*//
	public static SingletonLazyHolder getInstancia() {
	
	return InstanceHolder.instancia;
}

}


