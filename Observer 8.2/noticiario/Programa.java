package noticiario;

public class Programa {
	public static void main(String[] args) {
//		Publicador publicador = new Publicador();
		ConsomeNoticia agregadorTopico = new AgregadorTopico("jogos");
		Noticiario noticiario = new NoticiarioAssina(agregadorTopico);
		noticiario.notificaNoticia("a", 1, 1, "jogos");
		noticiario.notificaNoticia("b", 2, 1, "jogos");
		noticiario.notificaNoticia("c", 2, 1, "jogos");
		noticiario.notificaNoticia("d", 3, 1, "jogos");
		noticiario.notificaNoticia("e", 3, 1, "jogos");
		noticiario.notificaNoticia("NONONONONONON", 3, 1, "outro");
		noticiario.notificaNoticia("f", 3, 1, "jogos");
		noticiario.notificaNoticia("g", 3, 1, "jogos");
		noticiario.notificaNoticia("h", 3, 1, "jogos");
		noticiario.notificaNoticia("i", 3, 1, "jogos");
		noticiario.notificaNoticia("j", 3, 1, "jogos");
		noticiario.notificaNoticia("k", 4, 1, "jogos");
		noticiario.notificaNoticia("l", 4, 1, "jogos");
		
		System.out.println("///////////////////////////////////////");
		
		ConsomeNoticia agregadorMensal = new AgregadorMensal();
		noticiario = new NoticiarioAssina(agregadorMensal);
		noticiario.notificaNoticia("a", 1, 1, "jogos");
		noticiario.notificaNoticia("b", 2, 1, "jogos");
		noticiario.notificaNoticia("c", 2, 1, "jogos");
		noticiario.notificaNoticia("d", 3, 1, "jogos");
		noticiario.notificaNoticia("e", 3, 1, "jogos");
		noticiario.notificaNoticia("NONONONONONON", 3, 1, "outro");
		noticiario.notificaNoticia("f", 3, 1, "jogos");
		noticiario.notificaNoticia("g", 3, 1, "jogos");
		noticiario.notificaNoticia("h", 3, 1, "jogos");
		noticiario.notificaNoticia("i", 3, 1, "jogos");
		noticiario.notificaNoticia("j", 3, 1, "jogos");
		noticiario.notificaNoticia("k", 4, 2, "jogos");
		noticiario.notificaNoticia("l", 4, 2, "jogos");

	}
}
