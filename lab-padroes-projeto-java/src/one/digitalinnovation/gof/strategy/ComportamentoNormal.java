package one.digitalinnovation.gof.strategy;
//* aqui eu implemento a minha interface, pois ela que vai definir minha estratégia*//
public class ComportamentoNormal implements Comportamento {
//* aqui eu garanto que quem implementar a interface vai implementar o método  mover*//
	@Override
	public void mover() {
		//*aqui já temos um comportamento*//
		System.out.println("Movendo-se normalmente...");
		
	}

}
