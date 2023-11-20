package AulaAnnotations;

public class TesteAnnotation {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		DeprecatedTeste dep = new DeprecatedTeste();
		dep.visualizar();
		dep.exibir();
	}

}
