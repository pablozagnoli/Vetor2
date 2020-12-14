package vetor2;

import java.util.Scanner;

public class Vetor2 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        /* Aqui foram criadas os dois vetores Aluno & Nota que irão receber 
        * as informacoes de nomes e notas dos alunos.*/
        int Nota[] = new int[3];
        String Aluno[] = new String[3];
        int a = 0;
        
        /*Aqui temos a estrutura de repeticão for, a qual recebe 
        * o numero de repeticoes pelo objetio length o qual recebe o 
        * numero designado da quantidade de vetores criados no 
        * vetor associado a ele */
        for (int i = 0; i < Aluno.length; i++) {
            System.out.println("Digite o nome do aluno " + i);
          
            /*Nesta estrutura o [i] identifica o numeral do Vetor,
            * de acordo com o numero indicado pelo for em sua 
            * quantidade de repeticoes.*/
            Aluno[i] = teclado.next();
            
            /*Este objeto exibe a mensage concarternada com o nume do aluno e 
            * o objeto [i] este objeto e resposavel por identificar a variavel do vetor
            * de acordo com o numeral que o for identificar com sua repeticao*/
            System.out.println("Digite a nota do aluno " + Aluno[i]);
            Nota[i] = teclado.nextInt();

        }
        
        for (int i = 0; i < Aluno.length; i++) {
            
            /*Nessa estrutura, o if verifica se o valor do vetor Nota[] e maior ou igual a 7   
            * caso de verdadeiro, e exibida a mensagem que o aluno foi aprovado.
            * caso de falso, e exibida a mensagem que aluno foi reprovado.
            * O objeto [i] idenfica qual o numeral do vetor a qual esta associado, 
            * de acordo com a repeticão do for.*/
            if (Nota[i] >= 7) {
              
                /*Nesse objeto, o [i] e resposavel por identificar o numeral do vetor 
                a qual esta associado, de acordo com a repetiacao do for.*/
                System.out.println("O aluno " + Aluno[i] + " foi aprovado ") ;
            } else {
                System.out.println("O aluno " + Aluno[i] + " foi reprovado ");
            }

        }

    }
}
