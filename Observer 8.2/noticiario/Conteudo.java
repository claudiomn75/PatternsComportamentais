package noticiario;

public class Conteudo {
	String textoNoticia;
	int dia;
	int mes;
	String topico;
	
	public Conteudo(String textoNoticia, int dia, int mes, String topico) {
		this.textoNoticia = textoNoticia;
		this.dia = dia;
		this.mes = mes;
		this.topico = topico;
	}

	@Override
	public String toString() {
		return "Conteudo: " + dia + "/" + mes + ": " + topico + "->" + textoNoticia;
	}
	
	
}
