package poo.aagustini;

public class App {

	public static void main(String[] args) {
		System.out.println("\nMyFlight project...");

	GerenciadorCias gerCias = new GerenciadorCias();

	gerCias.cadastrar(new CiaAerea("CJJ", "LATAM Linhas Aéreas"));
	gerCias.cadastrar(new CiaAerea("G3", "Gol Linhas Aéreas SA"));
	gerCias.cadastrar(new CiaAerea("TP","TAP Portugal"));
	gerCias.cadastrar(new CiaAerea("AD", "Azul Linhas Aéreas"));

    System.out.println(gerCias.toString());
	

	}
}
