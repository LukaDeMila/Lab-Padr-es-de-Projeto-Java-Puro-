package one.digitalinnovation.gof.singleton;
/**
 * Sigleton "pregui�oso". N�o disponibiliza no primeiro momento a inst�ncia para o usu�rio
 * @author Ludymila
 *
 */
public class SingletonLazy {
	
	private static SingletonLazy instancia;
	private SingletonLazy() {
	super();//* deixar ess chamada expl�cita � uma quest�o de gosto, sem ela ou com ela ir� funcionar*//
	}
	
	//* s� quando ela for igual a null que instanciamos ela, � basicamente o que fizemos abaixo*//
	public static SingletonLazy getInstancia() {
		if(instancia==null) {
		instancia = new SingletonLazy();	
		}
	return instancia;
}
}
