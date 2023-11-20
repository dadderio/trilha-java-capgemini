
package ExerciciosJavaStart;

import java.util.Scanner;

/*22. Faça um algoritmo que receba o preço de custo e o preço de venda de 
40 produtos. Mostre como resultado se houve lucro, prejuízo ou empate para 
cada produto. Informe o valor de custo de cada produto, o valor de venda de 
cada produto, amédia de preço de custo e do preço de venda;*/

public class Exercicio22 {

    public static void main(String[] args) {
   
        Scanner leitor = new Scanner (System.in);
        
        String nomeProduto;
        float precoCusto;
        float precoVenda;
        
        float totalCusto = 0.0f;
        float totalVenda  = 0.0f;
        
              
        int i = 0;
        for (; i < 3; i++) {
            
            System.out.println("Informe o nome do Produto:  ");
            nomeProduto = leitor.next();
            
            System.out.println("Preço Custo: ");
            precoCusto = leitor.nextFloat();
            
            System.out.println("Preço Venda: ");
            precoVenda = leitor.nextFloat();
           
            totalCusto = totalCusto + precoCusto;
            totalVenda = totalVenda + precoVenda; 
                
            if (precoCusto == precoVenda){
                System.out.println("Empate de valores dos produtos");
            }else{  
                if(precoCusto>precoVenda){
                    System.out.println("Prejuízo");
                }else{
                    System.out.println("Lucro");
                }
            }
            
                 System.out.println(nomeProduto + ", preço custo = "+ precoCusto + 
                    ", preço venda = "+ precoVenda);      
                 
                                
       
        }
              
                System.out.println("A media preço Custo: "+ (totalCusto/i));
                System.out.println("A media preço Venda: "+ (totalVenda/i));  
    }

}  
