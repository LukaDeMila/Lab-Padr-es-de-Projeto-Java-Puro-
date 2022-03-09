package one.digitalinnovation.gof.singleton;
/**
 * Sigleton "preguiçoso". Não disponibiliza no primeiro momento a instância para o usuário
 * @author Ludymila
 *
 */
public class SingletonLazy {
	
	private static SingletonLazy instancia;
	private SingletonLazy() {
	super();//* deixar ess chamada explícita é uma questão de gosto, sem ela ou com ela irá funcionar*//
	}
	
	//* só quando ela for igual a null que instanciamos ela, é basicamente o que fizemos abaixo*//
	public static SingletonLazy getInstancia() {
		if(instancia==null) {
		instancia = new SingletonLazy();	
		}
	return instancia;
}
}
