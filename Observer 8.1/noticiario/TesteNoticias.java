package noticiario;

import noticiario.NoticiarioAssina;
import noticiario.FonteNoticias;
import noticiario.Noticia;

public class TesteNoticias {
	public static void main(String[] args) {
		FonteNoticias fonte = new FonteNoticias();
		
		NoticiarioAssina observador1 = new NoticiarioAssina(fonte, "Folha");	
		observador1.assina();
		
		NoticiarioAssina observador2 = new NoticiarioAssina(fonte, "Estadao");	
		observador2.assina();
		
		Noticia noticia = new Noticia();
		noticia.setTexto("Ontem choveu");
		noticia.setDia(2);
		noticia.setMes(4);
		noticia.setTopico("Previsão do Tempo");
		
		fonte.setNoticia(noticia);
		
		noticia.setTexto("Acabou a quarentena.");
		noticia.setDia(1);
		noticia.setTopico("Fake News");
		
		observador2.cancela();
		fonte.setNoticia(noticia);
		
		
	}
}
