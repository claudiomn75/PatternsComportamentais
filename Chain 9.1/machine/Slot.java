package machine;

public interface Slot {
	String getNomeSlot();
	void processar(Coin coin);
	void setSlot(Slot slot);
}
