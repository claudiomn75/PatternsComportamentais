package noticiario;

/* Esta interface é a interface Observer */

public interface ConsomeNoticia {
	public void consomeNoticia(String textoNoticia, int dia, int mes, String topico);
}
