package one.digitalinnovation.gof.singleton;

/**
 * 
 * Singleton "Lazy Holder".
 * @author Ludymila 
 *
 */

public class SingletonLazyHolder {
	
	private static class InstanceHolder{//* função de encapsular essa instância*//

	public static SingletonLazyHolder instancia = new SingletonLazyHolder();//* Ele é apressado já instância o q ele precisa devolver*//
	}
	private SingletonLazyHolder() {
	
		super();
	}
	
	//* só quando ela for igual a null que instanciamos ela, é basicamente o que fizemos abaixo*//
	public static SingletonLazyHolder getInstancia() {
	
	return InstanceHolder.instancia;
}

}


