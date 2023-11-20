
public class ExemploMenu {

	public static void main(String[] args) {
		
		//comando condicional SWITCH
		
		char opcao = '9';
		
		switch (opcao) {
		case '1': {
			System.out.println("programa de inclusão");
			break;
		}
		case '2': {
			System.out.println("programa de alteração");
			break;
		}
		case 3: {
			System.out.println("programa de exclusão");
			break;
		}
		case '4': {
			System.out.println("programa de consulta");
			break;
		}
		
		default:
			System.out.println("opção inválida");
			
		}
	}
	
	
}
