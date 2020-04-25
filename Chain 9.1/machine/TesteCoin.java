package machine;

import java.util.ArrayList;

public class TesteCoin {

	public static void main(String[] args) {
		Slot slot1 = new Slot1();
		Slot slot5 = new Slot5();
		Slot slot10 = new Slot10();
		Slot slot50 = new Slot50();
		
		slot1.setSlot(slot5);
		slot5.setSlot(slot10);
		slot10.setSlot(slot50);
		
		ArrayList<Coin> coins = new ArrayList<>();
		coins.add(new Coin(1));
		coins.add(new Coin(5));
		coins.add(new Coin(10));
		coins.add(new Coin(50));
		coins.add(new Coin(3));
		
		for(Coin coin: coins) {
			System.out.printf(">>>>>>>>>>>> Coin de %d inserida\n", coin.getValor());
			slot1.processar(coin);
		}

	}

}
