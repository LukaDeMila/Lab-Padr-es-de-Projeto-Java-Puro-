package one.digitalinnovation.gof.strategy;
//* aqui eu implemento a minha interface, pois ela que vai definir minha estrat�gia*//
public class ComportamentoNormal implements Comportamento {
//* aqui eu garanto que quem implementar a interface vai implementar o m�todo  mover*//
	@Override
	public void mover() {
		//*aqui j� temos um comportamento*//
		System.out.println("Movendo-se normalmente...");
		
	}

}
