package one.digitalinnovation.gof.strategy;

public class Robo {

	//O robô pode mudar de estratégia de comportamento*//
	
	private Comportamento comportamento;
// * vamos criar um método set para mudar a estrátegia de comportamento dele*//

	public void setComportamento(Comportamento comportamento) {
		this.comportamento = comportamento;
	}

	// * vou criar um método publico mover que vai delegar a responsabilidade de movimentação para nossa strategy*//
	
	public void mover() {
		comportamento.mover();
}
}