package Cadastros;

import java.util.List;

public class MenuTeste {

	public static void main(String[] args) {
		PessoaDao pd = new PessoaDao();
		List<Pessoa> listaDePessoas = pd.ListarPessoas();
		for (Pessoa p : listaDePessoas) {
			System.out.println("Código....." + p.getIdPessoa());
			System.out.println("Nome......." + p.getNomePessoa());
			System.out.println("Email......" + p.getEmail());
			System.out.println("----------------------------------");
			
		}
	}

}
