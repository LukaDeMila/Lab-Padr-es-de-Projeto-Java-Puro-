package one.digitalinnovation.gof.strategy;

public class Robo {

	//O rob� pode mudar de estrat�gia de comportamento*//
	
	private Comportamento comportamento;
// * vamos criar um m�todo set para mudar a estr�tegia de comportamento dele*//

	public void setComportamento(Comportamento comportamento) {
		this.comportamento = comportamento;
	}

	// * vou criar um m�todo publico mover que vai delegar a responsabilidade de movimenta��o para nossa strategy*//
	
	public void mover() {
		comportamento.mover();
}
}