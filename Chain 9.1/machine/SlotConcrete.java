package machine;

public abstract class SlotConcrete implements Slot {
	public final int VALOR;
	private Slot slot;
	
	public SlotConcreto(int valor) {
		VALOR = valor;
	}

	@Override
	public String getNomeSlot() {
		return "Slot de " + VALOR;
	}

	@Override
	public void processar(Coin coin) {
		System.out.printf("**** Slot de %d diz: ", VALOR);
		if (moeda.getValor() == VALOR) {
			System.out.printf("coin de %d aceita.\n", coin.getValor());
		} else if (this.slot != null) {
			System.out.printf("não processo moedas de %d. Passando para %s\n",
					VALOR, this.slot.getNomeSlot());
			this.slot.processar(coin);
		} else {
			System.out.printf("coin de %d é inválida.\n", coin.getValor());
		}
	}

	@Override
	public void setSlot(Slot slot) {
		this.slot = slot;
	}

}
