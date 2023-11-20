import javax.swing.JOptionPane;

public class EntradaDados {

	public static void main(String[] args) {
		// Entrada de dados via JPOptionPane
		
		int idade;
		
		idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade da pessoa"));
		JOptionPane.showMessageDialog(null, "A pessoa tem " + idade + " anos de idade");

	}

}
